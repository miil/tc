package ch04.navigator.model;

import java.io.File;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.PlatformObject;

public class NavigatorRoot extends PlatformObject {
	private final String OSNAME = System.getProperty("os.name");
	private final boolean isWindows = OSNAME.indexOf("Windows") != -1;

	public FileBean[] getParentBeans() {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		IPath fullPath = root.getFullPath();
		System.out.println(root);
		System.out.println(fullPath);
		File f = isWindows ? new File(fullPath.toString()+"c:/") : new File("/");

		FileBean top = new FileBean(f);
		return top.getChildren();
	}

}
