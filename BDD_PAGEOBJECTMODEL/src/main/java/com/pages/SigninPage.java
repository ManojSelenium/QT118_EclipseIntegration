package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.SingninPageProperties;
import com.utils.WebDriverUtils;

public class SigninPage extends WebDriverUtils implements SingninPageProperties{

	WebDriver driver;
	public SigninPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}

	public void enterCreateAccountEmailAddress(String emailAddress) {
		enterText(EMAIL_LOCATOR, emailAddress);
	}
	
	public CreateAccountPage clickCreateAccountButton() {
		click(CREATEACCOUNTBUTTON_LOCATOR);
		return new CreateAccountPage(driver);
	}
}
