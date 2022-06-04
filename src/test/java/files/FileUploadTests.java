package files;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class FileUploadTests extends BaseTests {

    @Test
    public void testFileUpload(){
        var fileUploadPage = homePage.clickFileUpload();
        fileUploadPage.uploadFile("/Users/yagmur/IdeaProjects/TestAutomation/resources/chromedriver");
        assertEquals(fileUploadPage.getUploadedFiles(),"chromedriver");
    }

}
