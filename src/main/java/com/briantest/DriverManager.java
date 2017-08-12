package com.briantest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by brianwan on 12/08/2017.
 */
public class DriverManager {

    public static WebDriver driver;

    public void openBrowser(){
        File file = new File("/Users/brianwan/Desktop/chromedriver");
        System.setProperty("webdriver.chrome.driver", file.getAbsoluteFile().toString());
        driver=new ChromeDriver();
        driver.get("https://www.google.co.uk/");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){
        driver.quit();
    }
}
