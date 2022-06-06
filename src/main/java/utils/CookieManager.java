package utils;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import java.util.Set;

public class CookieManager{

    private WebDriver driver;

    public CookieManager(WebDriver driver){
        this.driver=driver;
    }

    public Set<Cookie> getCookies(){
        return driver.manage().getCookies();
    }

    public boolean isCookiePresent(String cookieName){
        return driver.manage().getCookieNamed(cookieName) != null;
    }

    public void deleteCookie(String cookieNamed) {
        driver.manage().deleteCookieNamed(cookieNamed);
    }

    private Cookie buildCookie(String name, String value){
        Cookie cookie = new Cookie.Builder(name,value)
                .domain("the-internet.herokuapp.com")
                .build();
        return cookie;
    }

}
