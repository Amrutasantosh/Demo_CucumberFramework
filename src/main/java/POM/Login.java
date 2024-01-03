package POM;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utils.BasePage;
import Utils.Driverfactory;
import Utils.readConfig;

public class Login extends BasePage  {
	public readConfig config;
	
	
	@FindBy(xpath = "//input[contains(@name,'uid')]")
	private WebElement UserName;

	@FindBy(xpath = "//input[contains(@name,'password')]")
	private WebElement Password;

	@FindBy(xpath = "//input[contains(@name,'btnLogin')]")
	private WebElement logInButton;

	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void Set_UserName() {
		readConfig config  = new readConfig();
		UserName.sendKeys(config.getUsername());
	}

	public void Set_Password() {
		readConfig config  = new readConfig();
		Password.sendKeys(config.getPassword());

	}

	public void Click_LogInButton() {
		logInButton.click();
	}

}
