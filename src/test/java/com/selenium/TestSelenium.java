package com.selenium;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestSelenium {

    @Test
    public void  startSeleniumTest(){

       System.setProperty("webdriver.gecko.driver", "C:\\test\\geckodriver.exe");

        WebDriver driver = new FirefoxDriver();

        driver.navigate().to("http://google.com");
        Assert.assertTrue("Google", driver.getTitle().equals("Google"));
        driver.close();

    }

}
