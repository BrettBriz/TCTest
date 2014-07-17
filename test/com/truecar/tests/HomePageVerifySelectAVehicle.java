package com.truecar.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truecar.objects.Homepage;
import com.truecar.navigation.HomepageURL;

public class HomePageVerifySelectAVehicle {
	
	WebDriver driver;
	Homepage homepage;
	HomepageURL url;
	
	@BeforeClass
	public void setup(){
		driver = new FirefoxDriver();
		homepage = new Homepage();
		url = new HomepageURL();
		url.getHomepageURL(driver);
	}
	
	@AfterClass
	public void tearDown(){
		driver.quit();
	}
	
	@Test
	public void homePageVerifySelectAVehicleLink() throws Exception{
		
		homepage.selectAVehicle(driver);
		Assert.assertEquals("New cars", driver.findElement(By.cssSelector("ul.search-tabs.cf > li.active")).getText());

	}

}
