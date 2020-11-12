package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.LandingPageProperties;
import com.utils.WebDriverUtils;

public class LandingPage extends WebDriverUtils implements LandingPageProperties{

	WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
	}
	public SigninPage clickSignIn() {
		click(SIGNIN_LOCATOR);
		return new SigninPage(driver);
	}

	public void clickContactUs() {

	}
}
