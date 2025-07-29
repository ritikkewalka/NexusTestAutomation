package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import dataprovider.ConfigReader;
import pages.HomePage;

public class HomePageTest extends BaseClass {
	HomePage homePage;


	@Test(priority = 2, description = "Verify Login User ID Is Same", groups = { "homepage", "Regression" })
	public void verifyDashboardDisplaysLoginUsername() {
		homePage = new HomePage(driver);

		homePage.verifyLoginID(ConfigReader.getValue("user"));

	}

}
