package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//new comments
public class CustomerpageBank {
	@FindBy(xpath="//h1[contains ( text(),'Accounts Overview')]")
	WebElement pagetitile;
	
	
public CustomerpageBank(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public boolean HeaderValidation() {
	return pagetitile.isDisplayed();
}
}
