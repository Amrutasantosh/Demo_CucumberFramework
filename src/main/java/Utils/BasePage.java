package Utils;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage extends Driverfactory {
	
	

	public  void OpenBrowser() throws IOException {
		Driverfactory.getDriver();
		readConfig config  = new readConfig();
		driver.get(config.getUrl());
	    
	}
	
}