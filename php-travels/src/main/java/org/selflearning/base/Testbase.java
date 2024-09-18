package org.selflearning.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class Testbase {
    public  WebDriver driver;
    private void  initializeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
        driver.manage().window().maximize();
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