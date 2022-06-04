package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FramesTests extends BaseTests {

    @Test
    public void testNestedFrames(){
        var framesPage = homePage.clickFrames();
        var nestedFramesPage = framesPage.clickNestedFrames();

        String leftText = "LEFT";
        String bottomText = "BOTTOM";
        assertEquals(nestedFramesPage.getTextOnBottomFrame(),bottomText);
        assertEquals(nestedFramesPage.getTextOnLeftFrame(),leftText);

    }
}
