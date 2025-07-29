package testcases;

import org.openqa.selenium.By;
import org.testng.Assert;

import org.testng.annotations.Test;

import base.BaseClass;
import dataprovider.ConfigReader;

import pages.LoginPage;
import resources.Locators;

public class LoginTest extends BaseClass {

	@Test(priority = 1, description = "Valid login", groups = { "login", "Regression" })
	public void validLoginTest() {
		LoginPage login = new LoginPage(driver);
		login.loginToApp(ConfigReader.getValue("user"), ConfigReader.getValue("password"));

		Assert.assertTrue(driver.findElement(By.xpath(Locators.WELCOME)).isDisplayed());
	}

}
