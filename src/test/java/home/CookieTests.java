package home;

import base.BaseTests;
import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;

import java.util.Set;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CookieTests extends BaseTests {

    @Test
    public void testDeleteCookie(){
     var cookieManager = getCookieManager();

     String cookieToBeDeleted = "optimizelyBuckets";
     cookieManager.deleteCookie(cookieToBeDeleted);

     assertFalse(cookieManager.isCookiePresent(cookieToBeDeleted));
    }
}
