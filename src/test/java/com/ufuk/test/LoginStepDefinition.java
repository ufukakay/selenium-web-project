package com.ufuk.test;

import com.ufuk.pageObjects.LoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.concurrent.TimeUnit;

public class LoginStepDefinition {

    LoginPage loginPage;

    @Given("^I go to the Guru login page$")
    public void goUrl() {
        loginPage = new LoginPage();
        loginPage.setUp("http://demo.guru99.com/V4/");
    }

    @When("^Enter valid \"(.*)\" and valid \"(.*)\"$")
    public void enterData(String username,String password) {
        loginPage.userName().sendKeys(username);
        loginPage.password().sendKeys(password);

    }

    @And("^Login Button Click$")
    public void loginButtonClick() {
        loginPage.loginButton().click();

    }

    @Then("^Login Successful$")
    public void loginSuccessful() {
        String actualTitle = loginPage.driver.getTitle();
        String expectedTitle = "Guru99 Bank Manager HomePage";

        Assert.assertEquals(actualTitle,expectedTitle);
        Reporter.log("Login Successful");
        loginPage.tearDown();

    }
}
