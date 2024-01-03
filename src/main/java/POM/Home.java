package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import Utils.BasePage;
import Utils.Driverfactory;

public class Home extends BasePage{
	
	
	
	public Home(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	public void Verify_Title() {
		
		String Expectedtitle ="GTPL Bank Manager HomePage";
		String ActualTitle = driver.getTitle();
		Assert.assertEquals(ActualTitle, Expectedtitle);
		System.out.println("Title is matched Home Page is open Successfully");
	}
	
}
