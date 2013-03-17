package oleg.ui.internal.dialog;

import java.util.Properties;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.dialogs.TitleAreaDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class DatabaseDialog extends TitleAreaDialog {

	private Text hostTxt;
	private Text userTxt;
	private Text passwordTxt;
	private Text portTxt;
	private Text sidTxt;

	private String appName;
	private String rootPath;
	private Composite generalContainer;

	/**
	 * Create the dialog.
	 * 
	 * @param parentShell
	 */
	public DatabaseDialog(Shell parentShell) {
		super(parentShell);
	}

	/**
	 * Create contents of the dialog.
	 * 
	 * @param parent
	 */
	public Control createDialogArea1(Composite parent) {
		return createDialogArea(parent);
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		setMessage("TestDialog.this.message"); //$NON-NLS-1$
		setTitle("ApplicationInfoDialog.title"); //$NON-NLS-1$
		generalContainer = (Composite) super.createDialogArea(parent);

		generalContainer.setLayoutData(new GridData(GridData.FILL_BOTH));
		generalContainer.setLayout(new GridLayout(1, false));

		Composite grpApplicationInfo = new Composite(generalContainer, SWT.NONE);
		GridData gd_grpApplicationInfo = new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1);
		gd_grpApplicationInfo.heightHint = 314;
		gd_grpApplicationInfo.widthHint = 689;
		grpApplicationInfo.setLayoutData(gd_grpApplicationInfo);
		grpApplicationInfo.setLayout(new GridLayout(5, false));
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);

		Label label = new Label(grpApplicationInfo, SWT.NONE);
		label.setAlignment(SWT.RIGHT);
		label.setText("User Name:");
		label.setLayoutData(new GridData(SWT.RIGHT, SWT.CENTER, false, false, 1, 1));

		userTxt = new Text(grpApplicationInfo, SWT.BORDER);
		userTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));

		Label label_5 = new Label(grpApplicationInfo, SWT.NONE);
		label_5.setText("TestDialog.label_5.text"); //$NON-NLS-1$

		Label label_1 = new Label(grpApplicationInfo, SWT.NONE);
		label_1.setText("Host Name:");

		hostTxt = new Text(grpApplicationInfo, SWT.BORDER);

		hostTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		hostTxt.setSize(168, 21);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);

		Label label_2 = new Label(grpApplicationInfo, SWT.NONE);
		label_2.setAlignment(SWT.RIGHT);
		label_2.setText("Password:");

		passwordTxt = new Text(grpApplicationInfo, SWT.BORDER);
		passwordTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(grpApplicationInfo, SWT.NONE);

		Label label_3 = new Label(grpApplicationInfo, SWT.NONE);
		label_3.setText("Port:");

		portTxt = new Text(grpApplicationInfo, SWT.BORDER);
		portTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);

		Label label_4 = new Label(grpApplicationInfo, SWT.NONE);
		label_4.setAlignment(SWT.RIGHT);
		label_4.setText("SID:");

		sidTxt = new Text(grpApplicationInfo, SWT.BORDER);
		sidTxt.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);
		new Label(grpApplicationInfo, SWT.NONE);

		Button btnDelete = new Button(grpApplicationInfo, SWT.NONE);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnDelete.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseUp(MouseEvent e) {
			}

		});
		btnDelete.setText("ApplicationDialog.btnDelete.text");
		return generalContainer;
	}

	/**
	 * Create contents of the button bar.
	 * 
	 * @param parent
	 */
	@Override
	protected void createButtonsForButtonBar(Composite okCancelContainer) {
		Button button = createButton(okCancelContainer, IDialogConstants.OK_ID, IDialogConstants.OK_LABEL, false);
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseDown(MouseEvent e) {
				System.out.println("MouseEvent e:"+ e);
			}
		});
		createButton(okCancelContainer, IDialogConstants.CANCEL_ID, IDialogConstants.CANCEL_LABEL, false);
		getButton(IDialogConstants.OK_ID).setEnabled(true);
	}

	/**
	 * Return the initial size of the dialog.
	 */
	@Override
	protected Point getInitialSize() {
		return new Point(694, 527);
	}

	@Override
	protected void okPressed() {
		rootPath = hostTxt.getText();
		super.okPressed();
	}

	public String getRootPath() {
		return rootPath;
	}

	public String getAppName() {
		return appName;
	}

	public Composite getGeneralContainer() {
		return generalContainer;
	}

	public void setData(Properties data) {
		hostTxt.setText(data.getProperty("host"));
		userTxt.setText(data.getProperty("user"));
		passwordTxt.setText(data.getProperty("password"));
		portTxt.setText(data.getProperty("port"));
		sidTxt.setText(data.getProperty("sid"));
	}

}
