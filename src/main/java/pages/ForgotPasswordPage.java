package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ForgotPasswordPage {
    private WebDriver driver;

    public ForgotPasswordPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setEmail(String email) {
        driver.findElement(By.id("email")).sendKeys(email);
    }

    public InternalServerErrorPage clickOnRetrievePassword() {
        driver.findElement(By.id("form_submit")).click();
        return new InternalServerErrorPage(driver);
    }
}
