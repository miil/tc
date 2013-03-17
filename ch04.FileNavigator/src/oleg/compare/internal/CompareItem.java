package oleg.compare.internal;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import org.eclipse.compare.IModificationDate;
import org.eclipse.compare.IStreamContentAccessor;
import org.eclipse.compare.ITypedElement;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.ISharedImages;
import org.eclipse.ui.PlatformUI;

public class CompareItem implements IStreamContentAccessor, ITypedElement,
		IModificationDate {
	private String contents, name;
	private long time;

	CompareItem(String name, String contents, long time) {
		this.name = name;
		this.contents = contents;
		this.time = time;
	}

	CompareItem(String name, String contents) {
		this.name = name;
		this.contents = contents;
	}
	
	
	public InputStream getContents(){ 
		try {
			return new FileInputStream(new File (name));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ByteArrayInputStream( name.getBytes() );
//		return new ByteArrayInputStream(contents.getBytes());
	}

	public Image getImage() {
		return PlatformUI.getWorkbench().getSharedImages().getImage(ISharedImages.IMG_OBJ_ADD);
	}

	public long getModificationDate() {
		return time;
	}

	public String getName() {
		return name;
	}

	public String getString() {
		return contents;
	}

	public String getType() {
		return "ini222";
	}


}