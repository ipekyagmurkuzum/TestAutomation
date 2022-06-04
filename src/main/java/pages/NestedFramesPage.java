package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NestedFramesPage {
    private WebDriver driver;
    private String topFrame = "frame-top";
    private String  leftFrame = "frame-left";
    private String bottomFrame = "frame-bottom";
    private By frameText = By.tagName("body");


    public NestedFramesPage(WebDriver driver) {
        this.driver = driver;
    }
    private void switchToLeftFrame(){
        driver.switchTo().frame(topFrame);
        driver.switchTo().frame(leftFrame);
    }

    private void switchToBottomFrame(){
        driver.switchTo().frame(bottomFrame);
    }

    private void switchToMainArea() {
        driver.switchTo().parentFrame();
    }

    public String getTextOnLeftFrame(){
        switchToLeftFrame();
        String text = driver.findElement(frameText).getText();
        switchToMainArea();//exit left to top
        switchToMainArea();//exit top to main
        return text;
    }

    public String getTextOnBottomFrame(){
        switchToBottomFrame();
        String text = driver.findElement(frameText).getText();
        switchToMainArea();
        return text;
    }
}
