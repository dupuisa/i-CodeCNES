/* The following code was generated by JFlex 1.6.1 */

/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */ 
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/ 

/**********************************************************************************/
/* This file is used to generate a rule checker for F77.Data.Initialisation rule. */
/* For further information on this, we advise you to refer to RNC manuals.	 	  */
/* As many comments have been done on the ExampleRule.lex file, this file    	  */
/* will restrain its comments on modifications.								 	  */
/*																			 	  */
/**********************************************************************************/

package fr.cnes.analysis.tools.fortran77.rules;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IPath;

import fr.cnes.analysis.tools.analyzer.exception.JFlexException;
import fr.cnes.analysis.tools.analyzer.datas.AbstractRule;import fr.cnes.analysis.tools.analyzer.datas.Violation;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.1
 * from the specification file <tt>lex/F77DATAInitialisation.lex</tt>
 */
public class F77DATAInitialisation extends AbstractRule {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int COMMENT = 2;
  public static final int NAMING = 4;
  public static final int NEW_LINE = 6;
  public static final int LINE = 8;
  public static final int CMN_STATE = 10;
  public static final int INIT = 12;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6, 6
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\57\1\60\1\60\1\60\22\0\1\47\1\1\1\54\1\0"+
    "\1\55\1\0\1\55\1\53\1\50\1\51\1\4\1\55\2\0\1\55"+
    "\1\63\12\56\2\0\1\61\1\52\1\62\2\0\1\36\1\32\1\3"+
    "\1\24\1\23\1\5\1\35\1\45\1\11\2\45\1\43\1\37\1\7"+
    "\1\12\1\21\1\45\1\22\1\31\1\10\1\6\5\45\4\0\1\46"+
    "\1\0\1\41\1\34\1\2\1\30\1\27\1\13\1\40\1\45\1\17"+
    "\2\45\1\44\1\42\1\15\1\20\1\25\1\45\1\26\1\33\1\16"+
    "\1\14\5\45\12\0\1\60\u1fa2\0\1\60\1\60\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\udfe6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\7\0\1\1\3\2\12\1\1\3\1\4\1\1\1\5"+
    "\1\6\1\7\2\2\15\1\17\5\1\10\1\5\1\11"+
    "\1\3\21\0\1\12\21\0\1\13\74\0\1\14\15\0"+
    "\1\14\14\0\1\14\55\0\1\15\10\0\1\16\1\0"+
    "\1\15\10\0\1\16\1\15\10\0\1\16\32\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[287];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\64\0\150\0\234\0\320\0\u0104\0\u0138\0\u016c"+
    "\0\u016c\0\u01a0\0\u01d4\0\u0208\0\u023c\0\u0270\0\u02a4\0\u02d8"+
    "\0\u030c\0\u0340\0\u0374\0\u03a8\0\u03dc\0\u016c\0\u016c\0\u0410"+
    "\0\u016c\0\u0444\0\u016c\0\u0478\0\u04ac\0\u04e0\0\u0514\0\u0548"+
    "\0\u057c\0\u05b0\0\u05e4\0\u0618\0\u064c\0\u0680\0\u06b4\0\u06e8"+
    "\0\u071c\0\u0750\0\u0784\0\u07b8\0\u07ec\0\u0820\0\u0854\0\u0888"+
    "\0\u08bc\0\u08f0\0\u0924\0\u0958\0\u098c\0\u09c0\0\u09f4\0\u071c"+
    "\0\u0750\0\u0a28\0\u0a5c\0\u0a90\0\u0ac4\0\u0af8\0\u0b2c\0\u0b60"+
    "\0\u0b94\0\u0bc8\0\u0bfc\0\u0c30\0\u0c64\0\u0c98\0\u0ccc\0\u0d00"+
    "\0\u0d34\0\u0d68\0\u0514\0\u0d9c\0\u0dd0\0\u0e04\0\u016c\0\u0e38"+
    "\0\u0e6c\0\u0ea0\0\u0ed4\0\u0f08\0\u0f3c\0\u0f70\0\u0fa4\0\u0fd8"+
    "\0\u100c\0\u1040\0\u071c\0\u0750\0\u0820\0\u1074\0\u10a8\0\u10dc"+
    "\0\u016c\0\u1110\0\u1144\0\u1178\0\u11ac\0\u11e0\0\u1214\0\u1248"+
    "\0\u127c\0\u12b0\0\u12e4\0\u1318\0\u134c\0\u1380\0\u13b4\0\u13e8"+
    "\0\u141c\0\u1450\0\u1484\0\u14b8\0\u14ec\0\u1520\0\u1554\0\u1588"+
    "\0\u15bc\0\u15f0\0\u1624\0\u1658\0\u168c\0\u16c0\0\u16f4\0\u1728"+
    "\0\u175c\0\u1790\0\u17c4\0\u17f8\0\u182c\0\u1860\0\u1894\0\u18c8"+
    "\0\u18fc\0\u1930\0\u1964\0\u1998\0\u19cc\0\u1a00\0\u1a34\0\u1a68"+
    "\0\u1a9c\0\u1ad0\0\u1b04\0\u1b38\0\u1b6c\0\u1ba0\0\u1bd4\0\u1c08"+
    "\0\u1c3c\0\u1c70\0\u1ca4\0\u1cd8\0\u1d0c\0\u016c\0\u1d40\0\u1d74"+
    "\0\u1da8\0\u1ddc\0\u1e10\0\u1e44\0\u1e78\0\u1eac\0\u1ee0\0\u1f14"+
    "\0\u1f48\0\u1f7c\0\u1fb0\0\u0514\0\u1fe4\0\u2018\0\u204c\0\u2080"+
    "\0\u20b4\0\u20e8\0\u211c\0\u2150\0\u2184\0\u21b8\0\u21ec\0\u2220"+
    "\0\u0820\0\u2254\0\u2288\0\u22bc\0\u22f0\0\u2324\0\u2358\0\u238c"+
    "\0\u23c0\0\u23f4\0\u2428\0\u245c\0\u2490\0\u24c4\0\u24f8\0\u252c"+
    "\0\u2560\0\u2594\0\u25c8\0\u25fc\0\u2630\0\u2664\0\u2698\0\u26cc"+
    "\0\u2700\0\u2734\0\u2768\0\u279c\0\u27d0\0\u2804\0\u2838\0\u286c"+
    "\0\u28a0\0\u28d4\0\u2908\0\u293c\0\u2970\0\u29a4\0\u29d8\0\u2a0c"+
    "\0\u2a40\0\u2a74\0\u2aa8\0\u2adc\0\u2b10\0\u2b44\0\u016c\0\u2b78"+
    "\0\u2bac\0\u2be0\0\u2c14\0\u2c48\0\u2c7c\0\u2cb0\0\u2ce4\0\u016c"+
    "\0\u2d18\0\u0514\0\u2d4c\0\u2d80\0\u2db4\0\u2de8\0\u2e1c\0\u2e50"+
    "\0\u2e84\0\u2eb8\0\u0514\0\u0820\0\u2eec\0\u2f20\0\u2f54\0\u2f88"+
    "\0\u2fbc\0\u2ff0\0\u3024\0\u3058\0\u0820\0\u308c\0\u30c0\0\u30f4"+
    "\0\u3128\0\u315c\0\u3190\0\u31c4\0\u31f8\0\u322c\0\u3260\0\u3294"+
    "\0\u32c8\0\u32fc\0\u3330\0\u3364\0\u3398\0\u33cc\0\u3400\0\u3434"+
    "\0\u3468\0\u349c\0\u34d0\0\u3504\0\u3538\0\u356c\0\u35a0";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[287];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\10\1\11\1\12\1\13\1\11\1\14\5\10\1\15"+
    "\5\10\1\16\2\10\1\17\1\20\2\10\1\21\1\22"+
    "\1\10\1\23\3\10\1\24\2\10\1\25\14\10\1\26"+
    "\1\27\1\30\2\10\1\31\1\11\55\31\1\26\1\27"+
    "\4\31\1\11\2\32\1\31\41\32\11\31\1\33\1\27"+
    "\3\31\1\10\1\11\1\34\1\35\1\11\1\36\5\37"+
    "\1\40\5\37\1\41\2\37\1\42\1\43\2\37\1\44"+
    "\1\45\1\37\1\46\3\37\1\47\2\37\1\50\3\37"+
    "\5\10\1\51\1\52\2\10\1\31\1\27\3\10\1\31"+
    "\1\11\1\53\1\54\1\31\1\55\5\56\1\57\5\56"+
    "\1\60\2\56\1\61\1\62\2\56\1\63\1\64\1\56"+
    "\1\65\3\56\1\66\2\56\1\67\3\56\5\31\1\70"+
    "\1\71\2\31\1\26\1\27\4\31\1\11\2\72\1\31"+
    "\41\72\11\31\1\26\1\27\2\31\1\73\1\31\1\11"+
    "\2\74\1\31\41\74\11\31\1\75\1\27\2\31\1\11"+
    "\104\0\1\76\55\0\1\77\57\0\1\100\71\0\1\101"+
    "\71\0\1\102\77\0\1\103\53\0\1\104\76\0\1\105"+
    "\30\0\1\106\71\0\1\107\61\0\1\110\71\0\1\111"+
    "\74\0\1\112\34\0\2\32\1\0\42\32\7\0\1\32"+
    "\7\0\2\113\1\0\13\113\1\114\26\113\1\115\1\116"+
    "\1\0\1\117\3\0\1\113\7\0\2\113\1\0\5\113"+
    "\1\120\34\113\1\115\1\116\1\0\1\117\3\0\1\113"+
    "\7\0\2\113\1\0\1\113\1\121\40\113\1\115\1\116"+
    "\1\0\1\117\3\0\1\113\7\0\2\113\1\0\42\113"+
    "\1\115\1\116\1\0\1\117\3\0\1\113\7\0\2\113"+
    "\1\0\7\113\1\122\32\113\1\115\1\116\1\0\1\117"+
    "\3\0\1\113\7\0\2\113\1\0\15\113\1\123\24\113"+
    "\1\115\1\116\1\0\1\117\3\0\1\113\7\0\2\113"+
    "\1\0\31\113\1\124\10\113\1\115\1\116\1\0\1\117"+
    "\3\0\1\113\7\0\2\113\1\0\21\113\1\125\20\113"+
    "\1\115\1\116\1\0\1\117\3\0\1\113\7\0\2\113"+
    "\1\0\34\113\1\126\5\113\1\115\1\116\1\0\1\117"+
    "\3\0\1\113\7\0\2\113\1\0\1\113\1\127\40\113"+
    "\1\115\1\116\1\0\1\117\3\0\1\113\7\0\2\113"+
    "\1\0\7\113\1\130\32\113\1\115\1\116\1\0\1\117"+
    "\3\0\1\113\7\0\2\113\1\0\5\113\1\131\34\113"+
    "\1\115\1\116\1\0\1\117\3\0\1\113\7\0\2\113"+
    "\1\0\13\113\1\132\26\113\1\115\1\116\1\0\1\117"+
    "\3\0\1\113\5\0\53\133\1\31\10\133\54\134\1\31"+
    "\7\134\2\0\2\135\1\0\13\135\1\136\26\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\5\135\1\142\34\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\1\135\1\143\40\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\42\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\7\135\1\144\32\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\15\135\1\145"+
    "\24\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\31\135\1\146\10\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\21\135\1\147"+
    "\20\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\34\135\1\150\5\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\1\135\1\151"+
    "\40\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\7\135\1\152\32\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\5\135\1\153"+
    "\34\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\13\135\1\154\26\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\72\1\0\42\72\7\0"+
    "\1\72\7\0\2\155\1\0\41\155\20\0\2\74\1\0"+
    "\42\74\7\0\1\74\54\0\1\156\56\0\1\157\60\0"+
    "\1\160\33\0\1\161\71\0\1\162\60\0\1\163\61\0"+
    "\1\164\73\0\1\165\61\0\1\166\77\0\1\167\65\0"+
    "\1\170\53\0\1\171\67\0\1\172\43\0\1\173\55\0"+
    "\2\113\1\0\35\113\1\174\4\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\54\0\1\115\1\116\1\0\1\117"+
    "\11\0\51\116\1\175\12\116\2\0\2\113\1\0\32\113"+
    "\1\176\7\113\1\115\1\116\1\0\1\117\3\0\1\113"+
    "\7\0\2\113\1\0\2\113\1\177\37\113\1\115\1\116"+
    "\1\0\1\117\3\0\1\113\7\0\2\113\1\0\10\113"+
    "\1\200\31\113\1\115\1\116\1\0\1\117\3\0\1\113"+
    "\7\0\2\113\1\0\5\113\1\201\34\113\1\115\1\116"+
    "\1\0\1\117\3\0\1\113\7\0\2\113\1\0\3\113"+
    "\1\202\36\113\1\115\1\116\1\0\1\117\3\0\1\113"+
    "\7\0\2\113\1\0\13\113\1\203\26\113\1\115\1\116"+
    "\1\0\1\117\3\0\1\113\7\0\2\113\1\0\11\113"+
    "\1\204\30\113\1\115\1\116\1\0\1\117\3\0\1\113"+
    "\7\0\2\113\1\0\25\113\1\205\14\113\1\115\1\116"+
    "\1\0\1\117\3\0\1\113\7\0\2\113\1\0\27\113"+
    "\1\206\12\113\1\115\1\116\1\0\1\117\3\0\1\113"+
    "\7\0\2\113\1\0\17\113\1\207\22\113\1\115\1\116"+
    "\1\0\1\117\3\0\1\113\7\0\2\113\1\0\23\113"+
    "\1\210\16\113\1\115\1\116\1\0\1\117\3\0\1\113"+
    "\7\0\2\135\1\0\35\135\1\211\4\135\1\137\1\140"+
    "\1\0\1\141\3\0\1\135\54\0\1\137\1\140\1\0"+
    "\1\141\11\0\51\140\1\212\12\140\2\0\2\135\1\0"+
    "\32\135\1\213\7\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\2\135\1\214\37\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\10\135\1\215\31\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\5\135\1\216\34\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\3\135\1\217\36\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\13\135\1\220\26\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\11\135\1\221\30\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\25\135\1\222\14\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\27\135\1\223\12\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\17\135\1\224\22\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\23\135\1\225\16\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\155\1\0\42\155\7\0\1\155\4\0"+
    "\1\31\2\0\2\226\1\0\41\226\1\0\1\227\5\0"+
    "\2\31\47\0\1\230\60\0\1\231\27\0\1\232\62\0"+
    "\1\233\64\0\1\234\31\0\1\235\64\0\1\236\27\0"+
    "\1\237\35\0\1\240\64\0\1\236\44\0\1\241\67\0"+
    "\1\242\43\0\1\243\71\0\1\244\71\0\1\245\43\0"+
    "\2\113\1\0\35\113\1\246\4\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\54\0\1\175\2\0\1\117\13\0"+
    "\2\113\1\0\32\113\1\247\7\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\1\113\1\250\1\0\42\113"+
    "\1\115\1\116\1\0\1\117\3\0\1\113\7\0\1\251"+
    "\1\113\1\0\42\113\1\115\1\116\1\0\1\117\3\0"+
    "\1\113\7\0\1\113\1\252\1\0\30\113\1\253\11\113"+
    "\1\115\1\116\1\0\1\117\3\0\1\113\7\0\2\113"+
    "\1\0\31\113\1\254\10\113\1\115\1\116\1\0\1\117"+
    "\3\0\1\113\7\0\1\255\1\113\1\0\33\113\1\256"+
    "\6\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\34\113\1\254\5\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\15\113\1\257"+
    "\24\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\21\113\1\260\20\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\1\113\1\261"+
    "\40\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\7\113\1\262\32\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\135\1\0\35\135\1\263"+
    "\4\135\1\137\1\140\1\0\1\141\3\0\1\135\54\0"+
    "\1\212\2\0\1\141\13\0\2\135\1\0\32\135\1\264"+
    "\7\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\1\135\1\265\1\0\42\135\1\137\1\140\1\0\1\141"+
    "\3\0\1\135\7\0\1\266\1\135\1\0\42\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\1\135\1\267"+
    "\1\0\30\135\1\270\11\135\1\137\1\140\1\0\1\141"+
    "\3\0\1\135\7\0\2\135\1\0\31\135\1\271\10\135"+
    "\1\137\1\140\1\0\1\141\3\0\1\135\7\0\1\272"+
    "\1\135\1\0\33\135\1\273\6\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\34\135\1\271"+
    "\5\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\15\135\1\274\24\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\21\135\1\275"+
    "\20\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\1\135\1\276\40\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\7\135\1\277"+
    "\32\135\1\137\1\140\1\0\1\141\3\0\1\135\54\0"+
    "\1\31\16\0\2\226\1\0\41\226\1\0\1\300\5\0"+
    "\2\31\25\0\1\301\55\0\1\302\61\0\1\303\71\0"+
    "\1\304\70\0\1\305\62\0\1\306\70\0\1\307\62\0"+
    "\1\310\47\0\1\311\71\0\1\312\106\0\1\313\64\0"+
    "\1\314\30\0\1\315\54\0\2\113\1\0\13\113\1\316"+
    "\26\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\5\113\1\317\34\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\3\113\1\320"+
    "\36\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\11\113\1\321\30\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\16\113\1\322"+
    "\23\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\15\113\1\323\24\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\22\113\1\324"+
    "\17\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\21\113\1\325\20\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\5\113\1\326"+
    "\34\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\13\113\1\327\26\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\36\113\1\330"+
    "\3\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\37\113\1\331\2\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\135\1\0\13\135\1\332"+
    "\26\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\5\135\1\333\34\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\3\135\1\334"+
    "\36\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\11\135\1\335\30\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\16\135\1\336"+
    "\23\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\15\135\1\337\24\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\22\135\1\340"+
    "\17\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\21\135\1\341\20\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\5\135\1\342"+
    "\34\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\13\135\1\343\26\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\36\135\1\344"+
    "\3\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\37\135\1\345\2\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\226\1\0\41\226\1\0"+
    "\1\346\5\0\2\31\22\0\1\347\55\0\1\347\65\0"+
    "\1\350\71\0\1\351\70\0\1\352\75\0\1\353\55\0"+
    "\1\354\74\0\1\355\30\0\1\356\71\0\1\357\72\0"+
    "\1\360\67\0\1\360\43\0\1\361\56\0\2\113\1\0"+
    "\10\113\1\362\31\113\1\115\1\116\1\0\1\117\3\0"+
    "\1\113\7\0\2\113\1\0\2\113\1\362\37\113\1\115"+
    "\1\116\1\0\1\117\3\0\1\113\7\0\2\113\1\0"+
    "\4\113\1\363\35\113\1\115\1\116\1\0\1\117\3\0"+
    "\1\113\7\0\2\113\1\0\12\113\1\364\27\113\1\115"+
    "\1\116\1\0\1\117\3\0\1\113\7\0\2\113\1\0"+
    "\17\113\1\365\22\113\1\115\1\116\1\0\1\117\3\0"+
    "\1\113\7\0\2\113\1\0\31\113\1\366\10\113\1\115"+
    "\1\116\1\0\1\117\3\0\1\113\7\0\2\113\1\0"+
    "\23\113\1\367\16\113\1\115\1\116\1\0\1\117\3\0"+
    "\1\113\7\0\2\113\1\0\34\113\1\370\5\113\1\115"+
    "\1\116\1\0\1\117\3\0\1\113\7\0\2\113\1\0"+
    "\1\113\1\371\40\113\1\115\1\116\1\0\1\117\3\0"+
    "\1\113\7\0\2\113\1\0\7\113\1\372\32\113\1\115"+
    "\1\116\1\0\1\117\3\0\1\113\7\0\2\113\1\0"+
    "\16\113\1\373\23\113\1\115\1\116\1\0\1\117\3\0"+
    "\1\113\7\0\2\113\1\0\22\113\1\373\17\113\1\115"+
    "\1\116\1\0\1\117\3\0\1\113\7\0\2\135\1\0"+
    "\10\135\1\374\31\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\2\135\1\374\37\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\4\135\1\375\35\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\12\135\1\376\27\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\17\135\1\377\22\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\31\135\1\u0100\10\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\23\135\1\u0101\16\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\34\135\1\u0102\5\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\1\135\1\u0103\40\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\7\135\1\u0104\32\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\135\1\0"+
    "\16\135\1\u0105\23\135\1\137\1\140\1\0\1\141\3\0"+
    "\1\135\7\0\2\135\1\0\22\135\1\u0105\17\135\1\137"+
    "\1\140\1\0\1\141\3\0\1\135\7\0\2\226\1\0"+
    "\41\226\1\0\1\u0106\5\0\2\31\17\0\1\u0107\71\0"+
    "\1\u0108\51\0\1\u0109\114\0\1\360\40\0\1\u010a\111\0"+
    "\1\360\31\0\1\u010b\71\0\1\u010c\102\0\1\u010d\30\0"+
    "\2\113\1\0\5\113\1\u010e\34\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\13\113\1\u010f"+
    "\26\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\1\113\1\u0110\40\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\32\113\1\373"+
    "\7\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\7\113\1\u0111\32\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\35\113\1\373"+
    "\4\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\3\113\1\u0112\36\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\11\113\1\u0113"+
    "\30\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\135\1\0\5\135\1\u0114\34\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\13\135\1\u0115"+
    "\26\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\1\135\1\u0116\40\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\32\135\1\u0105"+
    "\7\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\7\135\1\u0117\32\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\35\135\1\u0105"+
    "\4\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\3\135\1\u0118\36\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\11\135\1\u0119"+
    "\30\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\226\1\0\41\226\7\0\2\31\14\0\1\360\71\0"+
    "\1\360\70\0\1\313\67\0\1\314\46\0\1\u011a\71\0"+
    "\1\u011b\126\0\1\31\3\0\2\113\1\0\2\113\1\373"+
    "\37\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\10\113\1\373\31\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\15\113\1\330"+
    "\24\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\21\113\1\331\20\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\4\113\1\u011c"+
    "\35\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\113\1\0\12\113\1\u011d\27\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\135\1\0\2\135\1\u0105"+
    "\37\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\10\135\1\u0105\31\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\15\135\1\344"+
    "\24\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\21\135\1\345\20\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\4\135\1\u011e"+
    "\35\135\1\137\1\140\1\0\1\141\3\0\1\135\7\0"+
    "\2\135\1\0\12\135\1\u011f\27\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\14\0\1\313\71\0\1\314\50\0"+
    "\2\113\1\0\2\113\1\330\37\113\1\115\1\116\1\0"+
    "\1\117\3\0\1\113\7\0\2\113\1\0\10\113\1\331"+
    "\31\113\1\115\1\116\1\0\1\117\3\0\1\113\7\0"+
    "\2\135\1\0\2\135\1\344\37\135\1\137\1\140\1\0"+
    "\1\141\3\0\1\135\7\0\2\135\1\0\10\135\1\345"+
    "\31\135\1\137\1\140\1\0\1\141\3\0\1\135\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13780];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\7\0\2\11\14\1\2\11\1\1\1\11\1\1\1\11"+
    "\42\1\21\0\1\11\21\0\1\11\74\0\1\11\15\0"+
    "\1\1\14\0\1\1\55\0\1\11\10\0\1\11\1\0"+
    "\1\1\10\0\2\1\10\0\1\1\32\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[287];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
	String location = "MAIN PROGRAM";
	
	List<String> identifiers = new LinkedList<String>();
	
	public F77DATAInitialisation() {
    }

	@Override
	public void setInputFile(IPath file) throws FileNotFoundException {
		super.setInputFile(file);
		this.zzReader = new FileReader(file.toOSString());
	}


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public F77DATAInitialisation(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 188) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public List<Violation> run() throws java.io.IOException, JFlexException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
          {     return getViolations();
 }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { yybegin(LINE);
            }
          case 15: break;
          case 2: 
            { yybegin(COMMENT);
            }
          case 16: break;
          case 3: 
            { yybegin(NEW_LINE);
            }
          case 17: break;
          case 4: 
            { throw new JFlexException( new Exception("Illegal character <" + yytext() + ">") );
            }
          case 18: break;
          case 5: 
            { 
            }
          case 19: break;
          case 6: 
            { identifiers.clear(); location = location + " " + yytext(); yybegin(COMMENT);
            }
          case 20: break;
          case 7: 
            { identifiers.clear(); yybegin(NEW_LINE);
            }
          case 21: break;
          case 8: 
            { identifiers.add(yytext());
            }
          case 22: break;
          case 9: 
            { if(identifiers.contains(yytext())) identifiers.remove(yytext());
            }
          case 23: break;
          case 10: 
            { String var = yytext().replaceAll("\\s","").replaceAll("\\=", "");
								 if(var.contains("(")) var = var.split("\\(")[0];
								 if(identifiers.contains(var)) {
								 	setError(location,"The variable "+var+" shall be initialized with DATA or BLOCK DATA before its use.", yyline+1); 
								 	identifiers.remove(var); }
            }
          case 24: break;
          case 11: 
            { String var = yytext().replaceAll("\\s","").replaceAll("\\=", "");
								 if(var.contains("(")) var = var.split("\\(")[0];
								 if(identifiers.contains(var)) { 
								 	setError(location,"The variable "+var+" shall be initialized with DATA or BLOCK DATA before its use." + var, yyline+1); 
								 	identifiers.remove(var); }
            }
          case 25: break;
          case 12: 
            { yybegin(INIT);
            }
          case 26: break;
          case 13: 
            { yybegin(CMN_STATE);
            }
          case 27: break;
          case 14: 
            { location = yytext(); yybegin(NAMING);
            }
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
