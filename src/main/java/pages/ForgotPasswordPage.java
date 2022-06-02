package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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
