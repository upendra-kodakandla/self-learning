package org.selflearning.base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class Pagebase {
WebDriver driver;
    public Pagebase(WebDriver driver) {
        this.driver=driver;
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
    }
    public void scrollTo(int cordinateX, int cordinateY){
        String scrollCordinates = "window.scrollTo("+cordinateX+","+cordinateY+ ");";
        System.out.println(scrollCordinates);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript(scrollCordinates);
    }

    public void scrollToElement(WebElement element){
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
