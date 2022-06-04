package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FrameTests extends BaseTests {

    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWYSIWYGEditor();
        editorPage.clearTextArea();

        String text1 =  "hello";
        String text2 =  "world";

        editorPage.setInputToTextArea(text1);
        editorPage.clickIncreaseIndentButton();
        editorPage.setInputToTextArea(text2);
        assertEquals(editorPage.getTextFromEditor(),text1+text2);
    }
}
