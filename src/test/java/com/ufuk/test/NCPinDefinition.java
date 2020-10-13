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

public class NCPinDefinition {

    NewCustomerPage newCustomerPage;

    @Given("^I go to the New Customer Page PIN$")
    public void ıGoToTheNewCustomerPagePIN() {
        newCustomerPage = new NewCustomerPage();
        newCustomerPage.setUp("http://demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @When("^PIN field \"([^\"]*)\"$")
    public void pınField(String value) {
        if(value.equals("Keys"))
        {
            newCustomerPage.pin().sendKeys(Keys.SPACE);
        }
        else {
            newCustomerPage.pin().sendKeys(value);
        }

    }

    @And("^PIN Press TAB and move to next Field$")
    public void pınPressTABAndMoveToNextField() {
        newCustomerPage.pin().sendKeys(Keys.TAB);
    }

    @Then("^PIN Show Error Message \"([^\"]*)\"$")
    public void pınShowErrorMessage(String message)  {

        String expectedMessage = message;
        String actualMessage = newCustomerPage.driver.findElement(By.id("message6")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);

        newCustomerPage.tearDown();
    }
}
