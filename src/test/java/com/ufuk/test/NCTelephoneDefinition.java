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

public class NCTelephoneDefinition {

    NewCustomerPage newCustomerPage;

    @Given("^I go to the New Customer Page Telephone$")
    public void ıGoToTheNewCustomerPageTelephone() {
        newCustomerPage = new NewCustomerPage();
        newCustomerPage.setUp("http://demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @When("^Telephone field \"([^\"]*)\"$")
    public void telephoneField(String value)  {
        if(value.equals("Keys"))
        {
            newCustomerPage.mobileNum().sendKeys(Keys.SPACE);
        }
        else {
            newCustomerPage.mobileNum().sendKeys(value);
        }
    }

    @And("^Telephone Press TAB and move to next Field$")
    public void telephonePressTABAndMoveToNextField() {
        newCustomerPage.mobileNum().sendKeys(Keys.TAB);
    }

    @Then("^Telephone Show Error Message \"([^\"]*)\"$")
    public void telephoneShowErrorMessage(String message)  {
        String expectedMessage = message;
        String actualMessage = newCustomerPage.driver.findElement(By.id("message7")).getText();

        Assert.assertEquals(actualMessage,expectedMessage);

        newCustomerPage.tearDown();
    }
}
