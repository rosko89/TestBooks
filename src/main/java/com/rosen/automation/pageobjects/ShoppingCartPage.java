package com.rosen.automation.pageobjects;

import org.openqa.selenium.WebDriver;

public class ShoppingCartPage extends CommonPageTemplate {
	public ShoppingCartPage(Browsers browser) {
		super(browser);
	}
	
	public ShoppingCartPage(WebDriver driver){
		super(driver);
	}
}
