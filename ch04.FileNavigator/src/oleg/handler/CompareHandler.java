package oleg.handler;

import oleg.compare.internal.CompareInput;

import org.eclipse.compare.CompareUI;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

public class CompareHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		CompareUI.openCompareEditor(new CompareInput());
//		CompareUI.openCompareDialog(new CompareInput());
		
		return null;
	}

}
