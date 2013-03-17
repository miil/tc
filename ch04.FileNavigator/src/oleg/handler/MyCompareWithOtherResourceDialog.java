package oleg.handler;
import org.eclipse.compare.internal.CompareWithOtherResourceDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.widgets.Shell;

/**
 * This is a dialog that can invoke the compare editor on chosen files.
 */
@SuppressWarnings("restriction")
public class MyCompareWithOtherResourceDialog extends CompareWithOtherResourceDialog {

	protected MyCompareWithOtherResourceDialog(Shell shell, ISelection selection) {
		super(shell, selection);
		System.out.println("----------------selection-"+selection);
	}
	
}