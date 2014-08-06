package com.truecar.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truecar.navigation.HomepageURL;
import com.truecar.tools.HomePageLinkCheck;

public class HomePageVerifyLinks {

	WebDriver driver;
	HomepageURL url;
	HomePageLinkCheck links;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		url = new HomepageURL();
		url.getHomepageURL(driver);
		links = new HomePageLinkCheck();
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void homePageVerifyLinks() throws Exception {

		links.getHomePageLinks(driver);

	}

}
