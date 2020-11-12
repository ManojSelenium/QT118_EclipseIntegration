package com.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtils {

	WebDriver driver;
	public WebDriverUtils(WebDriver driver) {
		this.driver=driver;
	}

	public void click(By prop) {
		driver.findElement(prop).click();
	}

	public void enterText(By prop,String testData) {
		driver.findElement(prop).sendKeys(testData);
	}
	public String getText(By prop) {
		return driver.findElement(prop).getText();
	}
	public String getAttribute(By prop,String attributeKey) {
		return driver.findElement(prop).getAttribute(attributeKey);
	}
	public void selectValueDropDown(By prop,String value) {
		Select s=new Select(driver.findElement(prop));
		s.selectByValue(value);
	}
}
