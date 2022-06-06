package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

public class WindowManager {

    private WebDriver driver;
    private  WebDriver.Navigation navigate;

    public WindowManager(WebDriver driver){
        this.driver=driver;
        navigate= driver.navigate();
    }
    public void goBack(){
        navigate.back();
    }
    public void goForward(){
        navigate.forward();
    }
    public void refreshPage(){
        navigate.refresh();
    }
    public void goTo(String url){
        navigate.to(url);
    }

    public void switchToTab(int index){
        ArrayList tabs = new ArrayList(driver.getWindowHandles());
        driver.switchTo().window((String) tabs.get(index));

//        var windows = driver.getWindowHandles();
//        for (String window:windows){
//            System.out.println("Switching to window: " + window);
//            driver.switchTo().window(window);
//            System.out.println("Current window title: " + driver.getTitle());
//            if(tabTitle.equals(driver.getTitle())){
//                break;
//            }
//        }
    }

    public static void openInNewTab(By by, WebDriver driver) {
        Actions action = new Actions(driver);
        action.keyDown(Keys.COMMAND)
                .click(driver.findElement(by))
                .keyUp(Keys.COMMAND).build().perform();
    }
}
