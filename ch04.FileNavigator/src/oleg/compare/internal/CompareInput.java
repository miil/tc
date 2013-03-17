package oleg.compare.internal;

import java.util.Date;

import org.eclipse.compare.CompareConfiguration;
import org.eclipse.compare.CompareEditorInput;
import org.eclipse.compare.structuremergeviewer.DiffNode;
import org.eclipse.compare.structuremergeviewer.Differencer;
import org.eclipse.core.runtime.IProgressMonitor;

//SaveablesCompareEditorInput
public class CompareInput extends CompareEditorInput {
	public CompareInput() {
		super(new CompareConfiguration());
	}

	protected Object prepareInput(IProgressMonitor pm) {
		pm.beginTask("ResourceCompare.taskName", IProgressMonitor.UNKNOWN);
		CompareItem ancestor = new CompareItem("Common", "k1=ancestor contents\nk2=oleg", new Date().getTime()-12000L);
		String l = "c:/1/rf1-a1.ini";
		String r = "c:/1/rf2-a1.ini";
		System.out.println("left:"+ l);
		System.out.println("right:"+ r);
//		CompareItem left = new CompareItem( l, "Left", new Date().getTime());
//		CompareItem right = new CompareItem( r, "Right", new Date().getTime() - 200000L);
		CompareItem left = new CompareItem( l, "Left");
		CompareItem right = new CompareItem( r, "Right");
		
		pm.done();
		return new DiffNode(left, right);
//		return new DiffNode(null, Differencer.CONFLICTING, ancestor, left, right);
	}
}