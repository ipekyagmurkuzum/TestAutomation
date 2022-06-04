package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage {
    private WebDriver driver;

    private By chooseFileButton = By.cssSelector("#file-upload");

    private By uploadButton = By.id("file-submit");
    private By uploadedFiles = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    private void clickUploadButton(){
        driver.findElement(uploadButton).click();
    }

    public void uploadFile(String absolutePathOfFile) {
        driver.findElement(chooseFileButton).sendKeys(absolutePathOfFile);
        clickUploadButton();
    }

    public String getUploadedFiles(){
        return driver.findElement(uploadedFiles).getText();
    }
}
