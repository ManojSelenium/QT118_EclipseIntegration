package com.steps;

import io.cucumber.java.en.And;

public class CreateAccountPageSteps {

	Steps steps;
	
	public CreateAccountPageSteps(Steps steps) {
		this.steps=steps;
	}
	
	@And("I enter firstname as {string}")
	public void enter_firstname(String firstName) {
		steps.createAccountPage.enterFirstName(firstName);
	}
	@And("I enter lastname as {string}")
	public void enter_lastname(String lastName) {
		steps.createAccountPage.enterLastName(lastName);
	}
	@And("I enter password as {string}")
	public void enter_password(String password) {
	steps.createAccountPage.enterPassword(password);	
	}
	@And("I enter address as {string}")
	public void enter_address(String address) {
		steps.createAccountPage.enterAddress(address);
	}
	@And("I enter city as {string}")
	public void enter_city(String city) {
		steps.createAccountPage.enterCity(city);
	}
	
	@And("I select state as {string}")
	public void select_state(String state) {
		steps.createAccountPage.selectStateValue(state);
	}
	@And("I enter zipcode as {string}")
	public void enter_zipcode(String zipcode) {
		
	}
	@And("I enter phonenumber as {string}")
	public void enter_phonenumber(String phonenumber) {
		
	}
	@And("I enter alias as {string}")
	public void enter_alias(String alias) {
		
	}
}
