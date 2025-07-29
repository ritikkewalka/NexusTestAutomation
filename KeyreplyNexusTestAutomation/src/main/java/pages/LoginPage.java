package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.Utility;
import resources.Locators;

public class LoginPage 
{
	WebDriver driver;

	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	public void loginToApp(String uname, String pass) 
	{
		
		Utility.findElement(driver, By.id(Locators.LOGIN_USERNAME)).sendKeys(uname);
	
		Utility.findElement(driver, By.id(Locators.LOGIN_PASSWORD)).sendKeys(pass);
		
		Utility.clickElement(driver, By.xpath(Locators.LOGIN_SUBMIT));
	
		
	}

}
