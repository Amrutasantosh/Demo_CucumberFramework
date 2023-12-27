package Step_Definitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class logIn_StepDefinition {
	WebDriver driver;
	
	
	@Given("user on login page")
	public void user_on_login_page() {
	    WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
	     driver.get("https://demo.guru99.com/V1/index.php");
	}

	@When("^user enter \"(.*)\" and \\\"(.*)\\\"$")
	public void user_enter_user_name_and_password(String username,String password) {
	    driver.findElement(By.xpath("//input[contains(@name,'uid')]")).sendKeys(username);
	    driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys(password);

	}

	@And("user Click on logIn Button")
	public void user_click_on_log_in_button() {
	    driver.findElement(By.xpath("//input[contains(@name,'btnLogin')]")).click();

	}

	@Then("User NAvigate on HomePage")
	public void user_n_avigate_on_home_page() throws InterruptedException {
	    Thread.sleep(1000);
	    String ExpectedTitle = "GTPL Bank Manager HomePage";
	    String ActualTitle = driver.getTitle();
	    Assert.assertEquals(ExpectedTitle, ActualTitle);


}}
