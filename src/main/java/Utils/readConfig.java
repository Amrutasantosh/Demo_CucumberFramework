package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class readConfig extends BasePage{
	public Properties prop = null;
	public FileInputStream file;
	
	public readConfig() {
		try {
			FileInputStream file = new FileInputStream("C:/Users/rushi/OneDrive/Desktop/BDD_Cucumber/Banking_Application_Demo/src/main/java/Properties/config.properties");
			prop = new Properties();
			prop.load(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getUrl() {
		String url =  prop.getProperty("url");
		return url;
		
	}
	
	public String getUsername() {
		String username =  prop.getProperty("username");
		 return username;
	}
	
	public String getPassword() {
		String password =  prop.getProperty("password");
		 return password;
	}
}
	
	

