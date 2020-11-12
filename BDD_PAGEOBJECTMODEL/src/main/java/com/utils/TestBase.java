package com.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.pages.LandingPage;

public class TestBase implements Setup{

	public WebDriver driver;
	
	public void launchBrowser() {
		
		System.setProperty(CHROME_KEY, CHROME_PATH);
		driver=new ChromeDriver();
		maxmizeBrowser();
		waitForSomeTime(30);
		System.out.println("Driver From TestBase :" +driver);
	}
	
	public void maxmizeBrowser() {
		driver.manage().window().maximize();
	}
	public void waitForSomeTime(long seconds)
	{
		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public LandingPage enterURL(String sURL) {
		driver.get(sURL);
		return new LandingPage(driver);
	}
}
