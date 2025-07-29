package testcases;

import org.testng.annotations.Test;

import base.BaseClass;

import pages.LogoutPage;

public class LogoutTest extends BaseClass {

	@Test(priority = 4, description = "Valid logout", groups = { "login", "Regression" })
	public void validLogoutTest() {
		LogoutPage logout = new LogoutPage(driver);
		logout.logoutToApp();

	}
}
