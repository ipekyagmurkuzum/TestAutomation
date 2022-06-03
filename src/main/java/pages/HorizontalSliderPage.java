package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HorizontalSliderPage {
    private WebDriver driver;
    private By slider = By.tagName("input");
    public By range = By.tagName("span");

    public HorizontalSliderPage(WebDriver driver) {
        this.driver = driver;
    }

    private void setSliderFocus() {
        driver.findElement(slider).click();
    }

    public String dragTheSlider(String range) {
        setSliderFocus();
        while (!driver.findElement(this.range).getText().equals(range)) {
            driver.findElement(slider).sendKeys(Keys.RIGHT);
            System.out.println(driver.findElement(this.range).getText());
        }
        return driver.findElement(this.range).getText();
    }
}
