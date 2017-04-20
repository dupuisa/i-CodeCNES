/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                               */
/************************************************************************************************/ 

/**********************************************************************************/
/* This file is used to generate a rule checker for SH.DESIGN.Options rule.		  */
/* For further information on this, we advise you to refer to RNC manuals.	      */
/* As many comments have been done on the ExampleRule.lex file, this file         */
/* will restrain its comments on modifications.								      */
/*																			      */
/**********************************************************************************/

package fr.cnes.analysis.tools.shell.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;
import fr.cnes.analysis.tools.analyzer.datas.Violation;
import fr.cnes.analysis.tools.analyzer.exception.JFlexException;

%%

%class SHDESIGNOptions
%extends AbstractRule
%public
%line

%function run
%yylexthrow JFlexException
%type List<Violation>


%state COMMENT, NAMING, CASE, CASELONG

COMMENT_WORD = \#
FUNCTION     = "function"
FUNCT		 = {VAR}{SPACE}*\(\)
SPACE		 = [\ \r\t\f]
VAR		     = [a-zA-Z][a-zA-Z0-9\_]*

GETOPTS		 = "getopts"
GETOPT		 = "getopt"
CASE		 = "case"
ESAC		 = "esac"


																
%{
	private String location = "MAIN PROGRAM";
	
	/* getopts = true if getopts has been found */
	/* inGetopts = true if we are in the process of examining the different opts */
	/* help = true if "h" option found, version = true if "v" option found */
	private Boolean getopts = false, inGetopts = false, help = false, version = false;
	/* getoptExtern = true if getopt (no s) has been found */
	/* No equivalent to the inGetopts: getopt is usually used in a string, in turn used in an eval */
	/* helpLong = true if "help" option found, versionLong = true if "version" option found */
	private Boolean getoptExtern = false, helpLong = false, versionLong = false;
	
	/* There will be violations if getopts and getopt have not been found at the end (getopts = false, getoptExtern = false) */
	/* and within the case during option examination if h and v are not treated, nor help and version */

	int lineError = 0;

    public SHDESIGNOptions() {
    	
    }
	
	@Override
	public void setInputFile(IPath file) throws FileNotFoundException {
		super.setInputFile(file);
		this.zzReader = new FileReader(file.toOSString());
	}
			
%}

%eofval{
	if (!getopts || !getoptExtern || !help || !version || !helpLong || !versionLong) {
		if (lineError == 0) location = "MAIN PROGRAM";
		setError(location,"It is mandatory to use getopts and getopt and to provide the –h, -help, –v and -version options at least.", lineError);
	}
	return getViolations();
%eofval}


%%          



/****************************************************************************************/
/* PARTIAL VERIFICATION!!!!																*/
/* When a getopts is found in the code, the different options must be checked by a		*/
/* case statement.																		*/
/* NOTE: The values inside the case can't be verified further than h and v				*/
/****************************************************************************************/


/************************/
/* COMMENT STATE	    */
/************************/
<COMMENT>   	
		{
				\n             	{yybegin(YYINITIAL);}  
			   	.              	{}
		}
		
		
/************************/
/* NAMING STATE	    */
/************************/
<NAMING>   	
		{
				{VAR}			{location = yytext(); yybegin(YYINITIAL);}
				\n             	{yybegin(YYINITIAL);}  
			   	.              	{}
		}

/************************/
/* YYINITIAL STATE	    */
/************************/
<YYINITIAL>
		{
			  	{COMMENT_WORD} 	{yybegin(COMMENT);}
				{FUNCTION}     	{yybegin(NAMING);}
				{FUNCT}			{location = yytext().substring(0,yytext().length()-2).trim(); }
				{GETOPT}{SPACE}* {getoptExtern=true;}
			    {GETOPTS}		{getopts=true; inGetopts = true; lineError=yyline+1;}
			    {CASE}			{if(inGetopts) {inGetopts = false; lineError=yyline+1; yybegin(CASE);} 
								 else if (getoptExtern) yybegin(CASELONG);}
			    {VAR}			{}
	      		. | \n         	{}
		}
		
/************************/
/* CASE STATE	    */
/************************/

<CASE>   	
		{
				{COMMENT_WORD}		{yybegin(COMMENT);}
				h{SPACE}*\)			{help=true;}
				v{SPACE}*\)			{version=true;}
				{ESAC}         	 	{yybegin(YYINITIAL);}
				{VAR}			 	{}  

			   	\n | .         	 {}
		}

/************************/
/* CASELONG STATE	    */
/************************/

<CASELONG>   	
		{
				{COMMENT_WORD}		{yybegin(COMMENT);}
				"help"{SPACE}*\)	{helpLong=true;}
				"version"{SPACE}*\)	{versionLong=true;}
				{ESAC}         	 	{yybegin(YYINITIAL);}
				{VAR}			 	{}  

			   	\n | .         	 {}
		}


/************************/
/* ERROR STATE	        */
/************************/
				.|\n            {}