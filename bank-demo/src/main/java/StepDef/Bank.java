package StepDef;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import EventListeners.MyeventListener;
import Pages.CustomerpageBank;
import Pages.HomePageBank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import io.cucumber.plugin.EventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import utility.Read_Test_data;

public class Bank {
	EventFiringWebDriver edriver;
	WebDriver driver;
	HomePageBank hbank;
	CustomerpageBank cstmrbank;

	@Given("User is on homepage")
	public void user_is_on_homepage() throws IOException {
		
		String url = (String) Read_Test_data.getdata("url");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		//Creating event listener driver
		edriver = new EventFiringWebDriver(driver);
		edriver.register(new MyeventListener());
		driver = edriver;
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(url);
		hbank = new HomePageBank(driver);
	}

	@When("^User enters (.*) and (.*)$")
	public void user_enters_username_and_password(String user, String pass) {

		hbank.enterUserName(user);
		hbank.enterPassWord(pass);

	}

	@When("User clicks on Login button")
	public void user_clicks_on_login_button() {
		hbank.clickOnLogin();
	}

	@Then("validate the cutomer page is displayed.")
	public void validate_the_cutomer_page_is_displayed() {
		cstmrbank = new CustomerpageBank(driver);
		Assert.assertTrue(cstmrbank.HeaderValidation());

	}

	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {

	}

	@Then("validate signup form gets displayed")
	public void validate_signup_form_gets_displayed() {

	}

	@When("User enters firstname lastname address city stste zip code phoneno SSN")
	public void user_enters_firstname_lastname_address_city_stste_zip_code_phoneno_ssn() {

	}

	@When("User enters  username password and confirm password")
	public void user_enters_username_password_and_confirm_password() {

	}

	@Then("valiadte if the cutomer page gets displayed")
	public void valiadte_if_the_cutomer_page_gets_displayed() {

	}

	@Then("close the browser")
	public void teardown() {
		driver.close();
	}

}
