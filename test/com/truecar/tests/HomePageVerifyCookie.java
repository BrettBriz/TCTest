package com.truecar.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truecar.navigation.HomepageURL;
import com.truecar.tools.CookieTool;

public class HomePageVerifyCookie {
	
	WebDriver driver;
	HomepageURL url;
	CookieTool cookie;
	
	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		url = new HomepageURL();
		url.getHomepageURL(driver);
		cookie = new CookieTool();
	}
		
		@AfterClass
		public void tearDown(){
			driver.quit();
		}
		
		@Test
		public void getHomepageCookie() throws Exception {
			
			cookie.cookieCheck(driver);
			
		}

}
