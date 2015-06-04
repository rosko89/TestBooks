package com.rosen.automation.pageobjects;

import org.openqa.selenium.WebDriver;

import com.rosen.automation.properties.PropertiesCache;

public class RegistrationPage extends CommonPageTemplate {

	public RegistrationPage(Browsers browser) {
		super(browser);
		super.driver.get(PropertiesCache.getInstance().getProperty(
				"registration.url"));

	}

	public RegistrationPage(WebDriver driver) {
		super(driver);
		super.driver.get(PropertiesCache.getInstance().getProperty(
				"registration.url"));

	}

}
