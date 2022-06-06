package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static utils.WindowManager.openInNewTab;

public class DynamicLoadingPage {
    private WebDriver driver;
    private String linkXpath_Format = ".//a[contains(text(), '%s')]"; //see if it contains text
    private By link_Example1 = By.xpath(String.format(linkXpath_Format,"Example 1"));
    public By link_Example2 = By.xpath(String.format(linkXpath_Format,"Example 2"));


    public DynamicLoadingPage(WebDriver driver){
        this.driver=driver;
    }

    public DynamicLoadingExample1Page clickExample1() {
        driver.findElement(link_Example1).click();
        return new DynamicLoadingExample1Page(driver);
    }

    public DynamicLoadingExample2Page clickExample2() {
        driver.findElement(link_Example2).click();
        return new DynamicLoadingExample2Page(driver);
    }


    public DynamicLoadingExample1Page openExample1InNewTab(){
        openInNewTab(link_Example1,driver);
        return new DynamicLoadingExample1Page(driver);
    }
    public DynamicLoadingExample2Page openExample2InNewTab(){
//        driver.findElement(link_Example2).sendKeys(Keys.CONTROL, Keys.RETURN);
        openInNewTab(link_Example2,driver);
         return new DynamicLoadingExample2Page(driver);
    }


}
