package ch04;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;

import ch04.views.SampleView;
import ch04.views.SampleView2;

import org.slf4j.*;

public class Perspective implements IPerspectiveFactory {
	private static Logger log = LoggerFactory.getLogger(Perspective.class);

    public static final String ID = Perspective.class.getName();

    public void createInitialLayout(IPageLayout layout) {
    	
    	log.trace("===ttttttttttttttttt Trace");
    	log.info("====info");
    	log.debug("======debug==========i");
        String editorArea = layout.getEditorArea();
        layout.setEditorAreaVisible(false);

        IFolderLayout topLeft = layout.createFolder("topLeft", IPageLayout.LEFT, 0.50f, editorArea);
        topLeft.addView("navigator.view");
        
        IFolderLayout botLeft = layout.createFolder("bottomLeft", IPageLayout.BOTTOM, 0.75f,
                "topLeft");
        botLeft.addView(SampleView2.ID);
        botLeft.addView("ch04.progress.view");

        IFolderLayout topRight = layout.createFolder("topRight", IPageLayout.RIGHT, 0.13f, editorArea);
        
        topRight.addView("eclipse.navigator.view"); 
        topRight.addView(SampleView.ID); 

    }
}
