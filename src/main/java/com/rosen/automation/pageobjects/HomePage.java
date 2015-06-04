package com.rosen.automation.pageobjects;

import org.openqa.selenium.WebDriver;

public class HomePage extends CommonPageTemplate {
	public HomePage(WebDriver driver) {
		super(driver);
	}
	public HomePage(Browsers browser){
		super(browser);
	}
}
