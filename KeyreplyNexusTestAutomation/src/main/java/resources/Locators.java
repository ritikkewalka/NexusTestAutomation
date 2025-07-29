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
	public static final String HOME_ACTIVE_INSTANCES = "//div/p[contains(text(),'Active Instances')]";
	public static final String HOME_MONTHLY_INTERACTIONS = "//div/p[contains(text(),'Monthly Interactions')]";
	public static final String HOME_KNOWLEDGE_BASE = "//div/p[contains(text(),'Knowledge Base')]";
	public static final String HOME_ELLIPSIS = "//button[@id='reka-popover-trigger-v-0-2']";
	
	
	//LOGOUT
	public static final String LOGOUT_BUTTON = "//div[@id='reka-popover-content-v-0-3']/div/button";



	
}
