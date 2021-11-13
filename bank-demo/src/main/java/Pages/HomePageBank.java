package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBank {
//this is an object reopsitory
	@FindBy(css = "input[name='username']")
	WebElement userName;

	@FindBy(css = " input[name='password']")
	WebElement password;

	@FindBy(css = "  input[value='Log In']")
	WebElement loginButn;

	public HomePageBank(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}
	
	public void enterUserName(String user) {
		 userName.sendKeys(user);	
	}
	public void enterPassWord(String pass) {
		 password.sendKeys(pass);
	}
	public  void clickOnLogin() {
		loginButn.click();
	}
}
