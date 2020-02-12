package com.ufuk.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public WebDriver driver;

    public void setUp(String url){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Impos\\Desktop\\selenium-web-project\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(url);
    }

    public void tearDown(){
        driver.quit();
    }

}
