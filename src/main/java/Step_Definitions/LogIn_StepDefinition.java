package Step_Definitions;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.Home;
import POM.Login;
import Utils.BasePage;
import Utils.Driverfactory;
import Utils.readConfig;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LogIn_StepDefinition extends Driverfactory {
	 

	
	Login log;
	@Given("User on logIn Page")
	public void user_on_log_in_page() throws IOException {
		BasePage basepage = new BasePage();
		basepage.OpenBrowser();
	}

	@When("User Enters with valid Username and Valid Password")
	public void user_enters_with_valid_username_and_valid_password() {
		log = new Login(driver);
		log.Set_UserName();
		log.Set_Password();
	}

	@And("User Click on LogIn button")
	public void user_click_on_log_in_button() {
	    log.Click_LogInButton();
	}

	@Then("User Navigate on Home Page")
	public void user_navigate_on_home_page() {
	    Home home = new Home(driver);
	    home.Verify_Title();
	}





	
}
