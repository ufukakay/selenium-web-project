package com.ufuk.test;

import com.ufuk.pageObjects.NewCustomerPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class NCAddressDefinition {
    NewCustomerPage newCustomerPage;

    @Given("^I go to the New Customer Pages$")
    public void newCustomerPage() {
        newCustomerPage = new NewCustomerPage();
        newCustomerPage.setUp("http://demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @When("^Address field \"(.*)\"$")
    public void addressFieldEmpty(String value) {
        if(value.equals("Keys"))
        {
            newCustomerPage.address().sendKeys(Keys.SPACE);
        }
        else
        {
            newCustomerPage.address().sendKeys(value);

        }
    }

    @And("^Press TABs and move to next Field$")
    public void pressTAB() {
        newCustomerPage.address().sendKeys(Keys.TAB);
    }

    @Then("^Show Error Messages \"(.*)\"$")
    public void showErrorMessage(String message) {
        String expectedMessage = message;
        String actualMessage = newCustomerPage.driver.findElement(By.id("message3")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);
        newCustomerPage.tearDown();
    }
}
