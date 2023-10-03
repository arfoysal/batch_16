package LocatorLearning;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC11FileUpload extends DriverSetup {

    @Test
    public void testFileUpload() throws InterruptedException {
        driver.get("https://ps.uci.edu/~franklin/doc/file_upload.html");
        driver.findElement(By.name("userfile")).sendKeys("/Users/Batch/src/test/resources/Screenshot.png");
        Thread.sleep(10000);
    }
}
