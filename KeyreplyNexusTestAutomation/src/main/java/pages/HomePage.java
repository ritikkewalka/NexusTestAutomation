package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

import dataprovider.ConfigReader;
import resources.Locators;

public class HomePage
{
	WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}

	public void verifyLoginID(String username) {
		// TODO Auto-generated method stub
		Assert.assertTrue(
				driver.findElement(By.xpath(Locators.HOME_USER.replace("user", ConfigReader.getValue("user"))))
						.isDisplayed());
		
	}
	
	

	
	
	
}
