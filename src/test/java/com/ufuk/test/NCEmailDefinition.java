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

public class NCEmailDefinition {

    NewCustomerPage newCustomerPage;

    @Given("^I go to the New Customer Page Email$")
    public void ıGoToTheNewCustomerPageEmail() {
        newCustomerPage = new NewCustomerPage();
        newCustomerPage.setUp("http://demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @When("^Email field \"([^\"]*)\"$")
    public void emailField(String value) {
        if(value.equals("Keys"))
        {
            newCustomerPage.email().sendKeys(Keys.SPACE);
        }
        else {
            newCustomerPage.email().sendKeys(value);
        }
    }

    @And("^Email Press TAB and move to next Field$")
    public void emailPressTABAndMoveToNextField() {
        newCustomerPage.email().sendKeys(Keys.TAB);
    }

    @Then("^Email Show Error Message \"([^\"]*)\"$")
    public void emailShowErrorMessage(String message)  {
        String expectedMessage = message;
        String actualMessage = newCustomerPage.driver.findElement(By.id("message9")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);

        newCustomerPage.tearDown();
    }
}
