package alerts;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.AlertsPage;

import static org.testng.Assert.assertEquals;

public class ContextClickTests extends BaseTests {
    @Test
    public void testContextClick(){
        var contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.contextClickInTheBox();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu");
        contextMenuPage.alert_clickToAccept();
    }
}
