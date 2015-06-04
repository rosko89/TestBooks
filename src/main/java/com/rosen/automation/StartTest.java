package com.rosen.automation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Console;
import com.rosen.automation.pageobjects.Browsers;
import com.rosen.automation.pageobjects.HomePage;
import com.rosen.automation.properties.PropertiesCache;

public class StartTest {

	public static void main(String[] args) throws MalformedURLException {
		//PropertiesCache read=new PropertiesCache();
		
		//PropertiesCache prop = PropertiesCache.getInstance();
		//System.out.println(prop.getProperty(""));
		//HomePage homePage=new HomePage(Browsers.SAFARI);
		DesiredCapabilities capability = DesiredCapabilities.firefox();
		System.out.println(capability.getCapability(""));
		//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
		//driver.get("http://www.gol.bg");
	}

}
