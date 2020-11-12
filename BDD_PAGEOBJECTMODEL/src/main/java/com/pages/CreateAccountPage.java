package com.pages;

import org.openqa.selenium.WebDriver;

import com.objrepo.CreateAccountPageProeprties;
import com.utils.WebDriverUtils;

public class CreateAccountPage extends WebDriverUtils implements CreateAccountPageProeprties {

	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		super(driver);
		this.driver=driver;

	}

	public void enterFirstName(String firstName) {
		enterText(FIRSTNAME_LOCATOR, firstName);
	}
	public void enterLastName(String lastName) {
		enterText(LASTNAME_LOCATOR, lastName);
	}
	public void enterPassword(String password) {
		enterText(PASSWORD_LOCATOR, password);
	}
	public void enterAddress(String address) {
		enterText(ADDRESS_LOCATOR, address);
	}
	public void enterCity(String city) {
		enterText(CITY_LOCATOR, city);
	}
	public void selectStateValue(String state) {
		selectValueDropDown(STATE_LOCATOR, state);
	}
}
