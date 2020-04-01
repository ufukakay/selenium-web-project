package com.ufuk.test;

import com.ufuk.pageObjects.NewCustomerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class NCCityDefinition {
    NewCustomerPage newCustomerPage;

    @Given("^I go to the New Customer Page City Field$")
    public void newCustomerPage() {
        newCustomerPage = new NewCustomerPage();
        newCustomerPage.setUp("http://demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @When("^City field \"(.*)\"$")
    public void cityFieldEmpty(String value) {
        if(value.equals("Keys"))
        {
            newCustomerPage.city().sendKeys(Keys.SPACE);
        }
        else{
            newCustomerPage.city().sendKeys(value);
        }

    }

    @And("^Press TAB City Field and move to next Field$")
    public void pressTAB() {
        newCustomerPage.city().sendKeys(Keys.TAB);
    }

    @Then("^Show Error Message City Field \"(.*)\"$")
    public void showErrorMessage(String message) {
        String expectedMessage = message;
        String actualMessage = newCustomerPage.driver.findElement(By.id("message4")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);
        newCustomerPage.tearDown();
    }
}
