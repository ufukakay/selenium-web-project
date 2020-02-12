package com.ufuk.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {

    public WebElement userName(){
        return driver.findElement(By.cssSelector("input[name='uid']"));
    }

    public WebElement password(){
        return driver.findElement(By.cssSelector("input[name='password']"));
    }

    public WebElement loginButton(){
       return driver.findElement(By.cssSelector("input[type='submit']"));
    }
}
