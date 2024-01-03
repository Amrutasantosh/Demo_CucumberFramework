package Utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driverfactory {
	public static WebDriver driver;
	
	
	public static WebDriver getDriver() throws IOException {
		try {
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:/Users/rushi/OneDrive/Desktop/BDD_Cucumber/Banking_Application_Demo/src/main/java/Properties/config.properties");
		prop.load(file);
		String browsername = prop.getProperty("browser");
		switch(browsername) {
		case "firefox":
			if (null == driver) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				driver.manage().window().maximize();
			}
			break;

		case "chrome":
			// code
			if (null == driver) {
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				driver.manage().window().maximize();
			}
			break;

		case "ie":
			// code
			if (null == driver) {
				WebDriverManager.iedriver().setup();
				driver = new InternetExplorerDriver();
				driver.manage().window().maximize();
			}
			break;
		}
	} catch (Exception e) {
		System.out.println("Unable to load browser: " + e.getMessage());
	} finally {
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		
	}
	return driver;
}
}
