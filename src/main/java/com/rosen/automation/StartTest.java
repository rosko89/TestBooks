package com.rosen.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import com.rosen.automation.pageobjects.Browsers;
import com.rosen.automation.pageobjects.HomePage;
import com.rosen.automation.properties.PropertiesCache;

public class StartTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities capability = DesiredCapabilities.chrome();
		WebDriver driver = new RemoteWebDriver(new URL(
				"http://192.168.10.147:4444/wd/hub"), capability);
		HomePage home = new HomePage(driver);
		home.navigateToHomePage();
		home.navigateToRegistrationPage();
		
	}

}
