package com.ufuk.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class NewCustomerPage extends BaseClass {

    public WebElement name(){
        return driver.findElement(By.xpath("//input[@name='name']"));
    }
    public WebElement radioMale(){
        return driver.findElement(By.cssSelector("input[value='m']"));
    }
    public WebElement radioFemale(){
        return driver.findElement(By.cssSelector("input[value='f']"));
    }

    public WebElement birth(){
        return driver.findElement(By.cssSelector("input[type='date']"));
    }
    public WebElement address(){
        return driver.findElement(By.tagName("textarea"));
    }
    public WebElement city(){
        return driver.findElement(By.cssSelector("input[name='city']"));
    }
    public WebElement state(){
        return driver.findElement(By.cssSelector("input[name='state']"));
    }
    public WebElement pin(){
        return driver.findElement(By.cssSelector("input[name='pinno']"));
    }
    public WebElement mobileNum(){
        return driver.findElement(By.cssSelector("input[name='telephoneno']"));
    }
    public WebElement email(){
        return driver.findElement(By.cssSelector("input[name='emailid']"));
    }

    public WebElement password(){
        return driver.findElement(By.cssSelector("input[name='password']"));
    }
    public WebElement submit(){
        return driver.findElement(By.cssSelector("input[type='submit']"));
    }
    public WebElement reset(){
        return driver.findElement(By.cssSelector("input[type='reset']"));
    }
}
