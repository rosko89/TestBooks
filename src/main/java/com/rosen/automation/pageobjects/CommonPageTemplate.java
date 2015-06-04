package com.rosen.automation.pageobjects;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; // da go iznesa otdelno
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

// This checks the common functionalities of all the pages. In our case - the header and the footer, because they occur at all the pages.
public abstract class CommonPageTemplate {
	protected WebDriver driver;
	protected ArrayList<WebElement> headerElements;
	protected ArrayList<WebElement> footerElements;

	public CommonPageTemplate(WebDriver driver) {
		this.driver = driver;
	}

	public CommonPageTemplate(Browsers browser) {
		switch (browser) {
		case FIREFOX:
			this.driver = new FirefoxDriver();
			break;
		case SAFARI:
			this.driver = new SafariDriver();
			break;
		case CHROME:
			this.driver = new ChromeDriver();
			break;
		case IE:
			this.driver = new InternetExplorerDriver();
			break;
		default:
			this.driver = new FirefoxDriver();
			break;
		}
	}

	public HomePage navigateToHomePage() {
		this.driver.findElement(By.id("")).click();// да допиша
		return new HomePage(this.driver);
	}

	// da dobavq getter-i za elementite na header-a i footer-a
}