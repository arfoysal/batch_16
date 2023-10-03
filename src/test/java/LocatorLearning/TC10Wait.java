package LocatorLearning;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.time.Duration;

public class TC10Wait extends DriverSetup {

    @Test
    public void testWaitAlert(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.name("commit1")).click();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Assert.assertEquals(driver.findElement(By.id("delay")).getText(), "I appeared after 5 sec");
    }

    @Test
    public void testWebDriverWaitAlert(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.id("delayalert")).click();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        Alert alert = driver.switchTo().alert();
        Assert.assertEquals(alert.getText(), "I appeared after 5 seconds!");
    }

}
