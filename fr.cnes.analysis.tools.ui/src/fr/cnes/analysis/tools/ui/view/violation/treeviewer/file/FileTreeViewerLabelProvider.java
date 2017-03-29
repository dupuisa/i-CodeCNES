/************************************************************************************************/
/* i-Code CNES is a static code analyzer.                                                       */
/* This software is a free software, under the terms of the Eclipse Public License version 1.0. */
/* http://www.eclipse.org/legal/epl-v10.html                                                    */
/************************************************************************************************/
package fr.cnes.analysis.tools.ui.view.violation.treeviewer.file;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.plugin.AbstractUIPlugin;

import fr.cnes.analysis.tools.ui.exception.UnknownInstanceException;
import fr.cnes.analysis.tools.ui.view.AbstractLabelProvider;
import fr.cnes.analysis.tools.ui.view.violation.treeviewer.file.descriptor.IFileRuleDescriptor;
import fr.cnes.analysis.tools.ui.view.violation.treeviewer.file.descriptor.RuleDescriptor;
import fr.cnes.analysis.tools.ui.view.violation.treeviewer.file.descriptor.ViolationDescriptor;

/**
 * Set the content of a {@link FileTreeViewer} using
 * 
 */
public class FileTreeViewerLabelProvider extends AbstractLabelProvider {
    /** Static values that determines column types. **/
    /** This value is for rule criticity column. **/
    public static final int CRITICITY = 2;
    /** This value is for rule name column. **/
    public static final int LOCATION = 0;
    /** This value is for error's line column. **/
    public static final int LINE = 1;
    /** This value is for number of violations column. **/
    public static final int NB_VIOL = 3;

    /** Logger **/
    private static final Logger LOGGER = Logger
            .getLogger(FileTreeViewerLabelProvider.class.getName());

    /**
     * Constructor with integer parameter which represents the column created.
     * 
     * @param pType
     *            the column to create
     */
    public FileTreeViewerLabelProvider(final int pType) {
        super(pType);
    }

    /**
     * This functions set the text for each element of a column.
     * 
     * The text should be "--" is the element shouldn't contain information for
     * the column.
     * 
     * @param element
     *            the element store in the column
     * @return the text to store in column case
     */
    @Override
    public String getText(final Object element) {
        LOGGER.finest("Begin getText method");

        String text = "";
        if (element instanceof IFileRuleDescriptor) {
            switch (this.getType()) {
                case CRITICITY:
                    break;
                case LOCATION:
                    text = ((IFileRuleDescriptor) element).getName();
                    break;
                case LINE:
                    if (element instanceof ViolationDescriptor) {
                        text = ((IFileRuleDescriptor) element).getValue().toString();
                    } else {
                        text = "--";
                    }
                    break;
                case NB_VIOL:
                    if (element instanceof ViolationDescriptor) {
                        text = "--";
                    } else {
                        text = ((IFileRuleDescriptor) element).getValue().toString();
                    }
                    break;
                default:
                    final RuntimeException exception = new ArrayIndexOutOfBoundsException(
                            "Wrong column value for ViolationsLabelProvider class : "
                                    + this.getType());
                    LOGGER.log(Level.FINER, exception.getClass() + " : " + exception.getMessage(),
                            exception);
                    MessageDialog.openError(
                            PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                            "Internal Error",
                            "Contact support service : \n" + exception.getMessage());
                    break;
            }
        } else {
            final UnknownInstanceException exception = new UnknownInstanceException(
                    "getText method of ViolationsLabelProvider class has a "
                            + element.getClass().getName()
                            + " element, but it should be an IRuleDescriptor instance.");
            LOGGER.log(Level.FINER, exception.getClass() + " : " + exception.getMessage(),
                    exception);
            MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
                    "Internal Error", "Contact support service : \n" + exception.getMessage());
        }

        LOGGER.finest("End getText method");
        return text;
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.eclipse.jface.viewers.ColumnLabelProvider#getImage(java.lang.Object)
     */
    @Override
    public Image getImage(final Object element) {
        LOGGER.finest("Begin getImage method");

        Image image = null;
        if (this.getType() == CRITICITY && element instanceof RuleDescriptor) {
            if (((RuleDescriptor) element).getCriticity().contains("Error")) {
                image = AbstractUIPlugin.imageDescriptorFromPlugin("fr.cnes.analysis.tools.ui",
                        "icons/logo-i-code-rouge-16x16.png").createImage();
            } else {
                image = AbstractUIPlugin.imageDescriptorFromPlugin("fr.cnes.analysis.tools.ui",
                        "icons/logo-i-code-orange-16x16.png").createImage();
            }
        }

        LOGGER.finest("End getImage method");
        return image;
    }
}