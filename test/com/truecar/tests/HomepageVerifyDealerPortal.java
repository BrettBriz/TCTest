package com.truecar.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truecar.navigation.HomepageURL;
import com.truecar.objects.Footer;

public class HomepageVerifyDealerPortal {
	
	WebDriver driver;
	HomepageURL url;
	Footer footer;
	
	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		url = new HomepageURL();
		url.getHomepageURL(driver);
		footer = new Footer();	
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void homePageVerifyDealerPortalLink () throws Exception {
		
		footer.dealerLogin(driver);
		Assert.assertEquals("TrueCar Dealer Network", driver.getTitle());
		
	}
	
}
