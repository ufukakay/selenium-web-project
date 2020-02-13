package com.ufuk.test;

import com.ufuk.pageObjects.NewCustomerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class NCustomerNameDefinition {
    NewCustomerPage newCustomerPage;

    @Given("^I go to the New Customer Page$")
    public void newCustomerPage() {
        newCustomerPage = new NewCustomerPage();
        newCustomerPage.setUp("http://demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @When("^Name field \"(.*)\"$")
    public void nameFieldEmpty(String value) {
        newCustomerPage.name().sendKeys(value);
    }

    @And("^Press TAB and move to next Field$")
    public void pressTAB() {
        newCustomerPage.name().sendKeys(Keys.TAB);
    }

    @Then("^Show Error Message \"(.*)\"$")
    public void showErrorMessage(String message) {
        String expectedMessage = message;
        String actualMessage = newCustomerPage.driver.findElement(By.id("message")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);
        newCustomerPage.tearDown();
    }
}
