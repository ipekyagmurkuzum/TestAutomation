package forgotPassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPasswordPage;

public class ForgotPasswordTests extends BaseTests {
    @Test
    public void testForgotPassword(){
        ForgotPasswordPage forgotPasswordPage = homePage.clickForgotPassword();
        forgotPasswordPage.setEmail("tau@example.com");
        forgotPasswordPage.clickOnRetrievePassword();
    }
}
