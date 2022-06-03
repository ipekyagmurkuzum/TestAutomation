package slider;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {
    @Test
    public void testHorizontalSlider(){
        var sliderPage = homePage.clickHorizontalSlider();
        var range = sliderPage.dragTheSlider("4");
        assertEquals(range,"4");
    }
}
