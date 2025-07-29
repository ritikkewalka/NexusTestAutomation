package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import helper.Utility;
import resources.Locators;

public class LogoutPage {

	WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
	}

	public void logoutToApp() {
		// TODO Auto-generated method stub
		Utility.findElement(driver, By.xpath(Locators.HOME_ELLIPSIS)).click();

		Utility.findElement(driver, By.xpath(Locators.LOGOUT_BUTTON)).click();
		
		Assert.assertTrue(Utility.findElement(driver, By.id(Locators.LOGIN_USERNAME)).isDisplayed());

	}

}
