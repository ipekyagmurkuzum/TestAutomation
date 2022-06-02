package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class ForgotPasswordTests extends BaseTests {

    @Test
    public void testForgotPassword() throws InterruptedException {

        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        forgotPasswordPage.clickOnRetrievePassword();
    }
}
