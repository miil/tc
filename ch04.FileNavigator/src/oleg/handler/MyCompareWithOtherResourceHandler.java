package oleg.handler;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareUI;
import org.eclipse.compare.internal.CompareEditor;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.internal.Workbench;

public class MyCompareWithOtherResourceHandler extends AbstractHandler {
	private ISelectionListener localListener;
	
	@SuppressWarnings("restriction")
	public Object execute(ExecutionEvent event) throws ExecutionException {
		ISelection selection = HandlerUtil.getCurrentSelection(event);
		IWorkbenchWindow window = Workbench.getInstance().getActiveWorkbenchWindow();
		ISelection selection2 = window.getActivePage().getSelection();
		System.out.println("selection2:"+selection2);
		IWorkbenchPage[] pages = window.getPages();
		for (IWorkbenchPage page : pages) {
			System.out.println("page:"+page.getLabel()+";  selection:"+page.getSelection());
		}
		
		IWorkbenchPage workbenchPage = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
		
		// CompareAction#isEnabled(ISelection)
		CompareConfiguration cc = new CompareConfiguration();
		cc.setProperty(CompareEditor.CONFIRM_SAVE_PROPERTY, new Boolean(false));

		MyResourceCompareInput input = new MyResourceCompareInput(cc);
		
		int selectionSize = 0;
		if (selection instanceof IStructuredSelection) {
			selectionSize = ((IStructuredSelection) selection).toArray().length;
		}
//		if ( selectionSize == 2) {
			if (input.isEnabled(selection) || selectionSize == 1) {

			// CompareAction#run(ISelection)
			if (!input.setSelection(selection, workbenchPage.getWorkbenchWindow().getShell(), false))
				return null;
			input.initializeCompareConfiguration();
			CompareUI.openCompareEditorOnPage(input, workbenchPage);
		}
		return null;
	}
}