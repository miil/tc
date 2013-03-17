package oleg.ui.internal.dialog;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.ViewerSorter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

import ch04.navigator.model.NavigatorRoot;
import ch04.navigator.view.SystemLabelProvider;
import ch04.navigator.view.TreeContentProvider;
import ch04.views.SampleView;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


public class HistoryDialog extends TitleAreaDialog {

	private KeyAdapter validationHandler = new KeyAdapter() {
		@Override
		public void keyReleased(KeyEvent e) {
			getButton(IDialogConstants.OK_ID).setEnabled(true);
		}
	};
	
	private TreeViewer viewer;
//	private DrillDownAdapter drillDownAdapter;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public HistoryDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("Snapshot History");
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setLayout(new GridLayout(1, false));

		Group grpAria = new Group(container, SWT.NONE);
		grpAria.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 3));
		grpAria.setText("Snapshot History List");
		grpAria.setLayout(new GridLayout(1, false));
		
		viewer = new TreeViewer(grpAria, SWT.BORDER | SWT.V_SCROLL);
//		viewer = new TreeViewer(grpConfigurationFiles, SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL);
		Tree tree = viewer.getTree();
		GridData gd_tree = new GridData(SWT.FILL, SWT.FILL, false, false, 1, 1);
		gd_tree.widthHint = 388;
		gd_tree.heightHint = 232;
		tree.setLayoutData(gd_tree);
//		drillDownAdapter = new DrillDownAdapter(viewer);
		viewer.setContentProvider(new TreeContentProvider());
		viewer.setLabelProvider(new SystemLabelProvider());
		viewer.setSorter(new NameSorter());
		viewer.setInput( new NavigatorRoot());
		viewer.refresh();
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		Button button = createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		getButton(IDialogConstants.OK_ID).setEnabled(true);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(440, 478);
	}

	@Override
	protected void okPressed() {
//		TODO Oleg add logic
		super.okPressed();
	}

	/**
	 * 
	 * @author Oleg B
	 *
	 */
	class NameSorter extends ViewerSorter {
	}
	
	/**
	 * 
	 * @author Oleg B
	 *
	 */
	class ViewLabelProvider extends SystemLabelProvider {

		public String getText(Object obj) {
			return obj.toString();
		}
		
		public Image getImage(Object obj) {
			String imageKey = ISharedImages.IMG_OBJ_ELEMENT;
//			if (obj instanceof TreeParent)
			   imageKey = ISharedImages.IMG_OBJ_PROJECT;
			
			return PlatformUI.getWorkbench().getSharedImages().getImage(imageKey);
		}
	}


}
