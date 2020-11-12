package com.steps;

import com.utils.TestBase;

import io.cucumber.java.en.And;

public class SigninPageSteps extends TestBase{
	
	Steps steps;
	
	public SigninPageSteps(Steps steps) {
		this.steps=steps;
	}
	@And("I enter create account email address {string}")
	public void enter_email_address(String emilAddress) {
		steps.signinPage.enterCreateAccountEmailAddress(emilAddress);
	}
	
	@And("I click on create account button")
	public void click_on_createaccount() {
		steps.createAccountPage=steps.signinPage.clickCreateAccountButton();
	}
}
