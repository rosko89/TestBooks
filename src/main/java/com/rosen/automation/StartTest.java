package com.rosen.automation;

import com.rosen.automation.pageobjects.HomePage;
import com.rosen.automation.properties.PropertiesCache;

public class StartTest {

	public static void main(String[] args) {
		//PropertiesCache read=new PropertiesCache();
		
		PropertiesCache prop = PropertiesCache.getInstance();
		System.out.println(prop.getProperty(""));
		HomePage homePage=new HomePage();
	}

}
