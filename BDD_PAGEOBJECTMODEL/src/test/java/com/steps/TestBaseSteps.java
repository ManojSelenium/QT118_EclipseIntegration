package com.steps;

import com.utils.Setup;
import com.utils.TestBase;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class TestBaseSteps {

	Steps steps;
	
	public TestBaseSteps(Steps steps) {
		this.steps=steps;
	}
	
	@Given("I launch the browser")
	public void launch_Browser() {
		steps.testBase=new TestBase();
		steps.testBase.launchBrowser();
	}

	@When("I enter URL")
	public void enter_URL() {
		 steps.landingPage=steps.testBase.enterURL(Setup.APPLICATION_URL);
	}





}
