package com.truecar.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truecar.objects.HomePageHeader;
import com.truecar.navigation.HomepageURL;

public class HomePageVerifyHeaderLogin {

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
	public void homePageVerifyLoginLink() throws Exception {

		header.login(driver);
		Assert.assertEquals("Sign In", driver.findElement(By.cssSelector("h2.h2")).getText());

	}

}
