package com.steps;

import io.cucumber.java.en.And;

public class LandingPageSteps{
	
	Steps steps;

	public LandingPageSteps(Steps steps) {
		this.steps=steps;
	}

	@And("I click on signin link in the landing page")
	public void click_on_signin() {
		steps.signinPage=steps.landingPage.clickSignIn();
	}
}
