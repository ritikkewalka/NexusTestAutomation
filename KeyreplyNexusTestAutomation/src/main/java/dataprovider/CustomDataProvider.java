package dataprovider;

import org.testng.annotations.DataProvider;

public class CustomDataProvider 
{
	@DataProvider(name="login")
	public static Object[][] getUserDetails()
	{
		System.out.println("LOG:INFO - Generating Test Data For The Test");
		
		Object[][]arr= ExcelReader.getDataFromExcel("login_details");
		arr[0][0]=ConfigReader.getValue("user");
		arr[0][1]=ConfigReader.getValue("password");
		System.out.println("LOG:INFO - Test Data Generated");
		
		return arr;
	}

}
