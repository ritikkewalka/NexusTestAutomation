package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.DataProvider;

public class ConfigReader 
{
	@DataProvider(name="loginwithconfigfiles")
	public static String getValue(String key)
	{
		
		Properties pro=new Properties();
		
		try 
		{
			pro.load(new FileInputStream(new File(System.getProperty("user.dir")+"/configuration/config.properties")));
			
		} catch (IOException e) {
			
			System.out.println("LOG:FAIL - Unable To Read Config File "+e.getMessage());
		}
		
		String value=pro.getProperty(key);
		
		return value;
	}

}
