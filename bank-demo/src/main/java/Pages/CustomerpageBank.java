package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//new comments added by Arun by Darsh
public class CustomerpageBank {
	@FindBy(xpath="//h1[contains ( text(),'Accounts Overview')]")
	WebElement pagetitile;

	//aDDEdBY Kash on 11/11
	
public CustomerpageBank(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public boolean HeaderValidation() {
	return pagetitile.isDisplayed();
}
}
