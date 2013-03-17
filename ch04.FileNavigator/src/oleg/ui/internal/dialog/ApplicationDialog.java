package oleg.ui.internal.dialog;

import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.jface.viewers.ArrayContentProvider;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.ListViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyAdapter;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import ch04.navigator.model.NavigatorRoot;


public class ApplicationDialog extends TitleAreaDialog {

	private KeyAdapter validationHandler = new KeyAdapter() {
		@Override
		public void keyReleased(KeyEvent e) {
			getButton(IDialogConstants.OK_ID).setEnabled(true);
		}
	};
	private ListViewer fileDefsListViewer;
	private String appName;
	private String rootPath;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public ApplicationDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	@Override
	protected Control createDialogArea(Composite parent) {
		setTitle("ApplicationInfoDialog.title"); //$NON-NLS-1$
		Composite area = (Composite) super.createDialogArea(parent);
		Composite container = new Composite(area, SWT.NONE);
		container.setLayoutData(new GridData(GridData.FILL_BOTH));
		container.setLayout(new GridLayout(1, false));

		Group grpConfigurationFiles = new Group(container, SWT.NONE);
		grpConfigurationFiles.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 4, 3));
		grpConfigurationFiles.setText("ApplicationInfoDialog.configrationFilesGroupTitle"); //$NON-NLS-1$
		grpConfigurationFiles.setLayout(new GridLayout(1, false));
		
		fileDefsListViewer = new ListViewer(grpConfigurationFiles, SWT.BORDER | SWT.V_SCROLL);
		List list = fileDefsListViewer.getList();
		
		list.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 2));
		
		fileDefsListViewer.setContentProvider(new ArrayContentProvider());
		fileDefsListViewer.setLabelProvider(new LabelProvider());
				//		Oleg
		fileDefsListViewer.setInput(new NavigatorRoot());
		return area;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite parent) {
		createButton(parent, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, true);
		createButton(parent, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		getButton(IDialogConstants.OK_ID).setEnabled(false);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(677, 616);
	}

	@Override
	protected void okPressed() {
		appName = "appNameTxt.getText()";
		rootPath = "rootPathTxt.getText()";
		super.okPressed();
	}

	public String getRootPath() {
		return rootPath;
	}

	public String getAppName() {
		return appName;
	}


}
