package org.selflearning.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class Testbase {
    public  WebDriver driver;
    public void  initializeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    driver.manage().window().maximize();
    }
    public void navigateToURL(){
        driver.get("https://phptravels.net/login");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public WebDriver getDriver(){
        if (driver==null){
            initializeDriver();
        }
        return driver;
    }
    @AfterMethod
    public void quitBrowser() {
        driver.quit();
    }
}
