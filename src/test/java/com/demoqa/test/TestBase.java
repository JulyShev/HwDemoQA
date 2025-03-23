package com.demoqa.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class TestBase {
    WebDriver driver;

    @BeforeMethod
     public void setUp(){
      driver = new ChromeDriver();
      driver.get("https://demowebshop.tricentis.com");
      driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public boolean isElementsPresent2(){
     return driver.findElements(By.cssSelector("h2[class='topic-html-content-header']")).size()>0;
    }

    public boolean isElementPresent(By locator){
      return driver.findElements(locator).size()>0;
     }

    @AfterMethod (enabled = false)
     public void tearDown(){
      driver.quit();
     }

    public void type(By locator, String text) {
        click(locator);
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(text);
    }

    public void click(By locator) {
        driver.findElement(locator).click();
    }
}
