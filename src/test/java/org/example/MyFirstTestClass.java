package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import static org.testng.Assert.assertEquals;

public class MyFirstTestClass extends DriverSetup {
    @Test
    public void testPageTitle(){
        // load website
        driver.get("https://www.google.com");

        // Test page title
        assertEquals(driver.getTitle(), "Googlee");
        System.out.println("Current page URL: " + driver.getCurrentUrl());

    }
}
