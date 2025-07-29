package stepdefs;

import io.cucumber.java.en.*;

import utils.Constants;
import utils.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import base.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;



public class LoginStepDef extends BaseTest {

    @Given("user launches the application")
    public void launchApp() {
        driver.get(Constants.BASE_URL);
    }

    @When("user logs in with username {string} and password {string}")
    public void login(String username, String password) {
    	
       driver.findElement(By.xpath(Locators.USERNAME_INPUT)).sendKeys(Constants.USERNAME);
       driver.findElement(By.xpath(Locators.PASSWORD_INPUT)).sendKeys(Constants.PASSWORD);
       driver.findElement(By.xpath(Locators.LOGIN_BUTTON)).click();

    }

    @Then("user should see the dashboard")
    public void verifyDashboard() {
    	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    	WebElement homeMenu = wait.until(
    	    ExpectedConditions.visibilityOfElementLocated(
    	        By.xpath(Locators.DASHBOARD_HEADING)
    	    )
    	);

    	// Now use assertion
    	Assert.assertTrue(homeMenu.isDisplayed(), "Home menu item is not visible");

    }
}
