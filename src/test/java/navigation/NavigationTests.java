package navigation;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertTrue;

public class NavigationTests extends BaseTests {

    @Test
    public void testNavigator(){
        homePage.clickDynamicLoading().clickExample1();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refreshPage();
        getWindowManager().goTo("https://google.com");
    }

    @Test
    public void testSwitchTab(){
        homePage.clickMultipleWindows().clickHere();
        getWindowManager().switchToTab(1);
    }

    @Test
    public void testOpenInNewTab(){
        var example2Page =  homePage.clickDynamicLoading().openExample2InNewTab();
        getWindowManager().switchToTab(1);
        assertTrue(example2Page.isStartButtonDisplayed());
    }
}
