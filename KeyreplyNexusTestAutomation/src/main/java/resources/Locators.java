package resources;

public class Locators {

	// LOGIN PAGE
	public static final String LOGIN_USERNAME = "username";
	public static final String LOGIN_PASSWORD = "password";
	public static final String LOGIN_SUBMIT = "//button[contains(text(), 'Continue')]";
	
	//HOME PAGE
	public static final String WELCOME = "//nav/ul/li[1]";
	public static final String HOME_USER = "//div/h3[contains(text(),\"user\")]";
	public static final String HOME_ACTIVE_USERS = "//div/p[contains(text(),'Active Users')]";
	
	

}
