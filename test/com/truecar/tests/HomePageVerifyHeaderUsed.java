package com.truecar.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truecar.objects.HomePageHeader;
import com.truecar.navigation.HomepageURL;

public class HomePageVerifyHeaderUsed {

	WebDriver driver;
	HomePageHeader header;
	HomepageURL url;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		header = new HomePageHeader();
		url = new HomepageURL();
		url.getHomepageURL(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void homePageVerifyUsedLink() throws Exception {

		header.shopUsed(driver);
		Assert.assertEquals("Pre-Owned and Used Cars for Sale", driver.findElement(By.cssSelector("h1")).getText());

	}

}
