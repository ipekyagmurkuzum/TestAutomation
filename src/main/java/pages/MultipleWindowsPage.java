package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPage {
    private WebDriver driver;
    private By clickHere_LinkText = By.linkText("Click Here");
    public MultipleWindowsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHere(){
        driver.findElement(clickHere_LinkText).click();
    }

}
