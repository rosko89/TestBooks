package com.rosen.automation.pageobjects;

import org.openqa.selenium.WebDriver;

import com.rosen.automation.properties.PropertiesCache;

public class HomePage extends CommonPageTemplate {
	public HomePage(WebDriver driver) {
		super(driver);
		super.driver.get(PropertiesCache.getInstance().getProperty(
				"homepage.url"));
	}

	public HomePage(Browsers browser) {
		super(browser);
		super.driver.get(PropertiesCache.getInstance().getProperty(
				"homepage.url"));
	}
	
	public LoginPage openLoginPage()
	{
		// to think if it's probably better to add this method in the abstract class
		return new LoginPage(this.driver);
	}
}
