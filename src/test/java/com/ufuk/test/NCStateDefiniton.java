package com.ufuk.test;

import com.ufuk.pageObjects.NewCustomerPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

public class NCStateDefiniton {

    NewCustomerPage newCustomerPage;

    @Given("^I go to the New Customer Page State$")
    public void ıGoToTheNewCustomerPageState() {
        newCustomerPage = new NewCustomerPage();
        newCustomerPage.setUp("http://demo.guru99.com/V4/manager/addcustomerpage.php");

    }

    @When("^State field \"([^\"]*)\"$")
    public void stateField(String value)  {
        newCustomerPage.state().sendKeys(value);
    }

    @And("^State Press TAB and move to next Field$")
    public void statePressTABAndMoveToNextField() {
        newCustomerPage.state().sendKeys(Keys.TAB);
    }

    @Then("^State Show Error Message \"([^\"]*)\"$")
    public void stateShowErrorMessage(String message)  {

        String expectedMessage = message;
        String actualMessage = newCustomerPage.driver.findElement(By.id("message5")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);

        newCustomerPage.tearDown();
    }
}
