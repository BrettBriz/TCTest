package com.truecar.tests;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.truecar.objects.HomePageOrbButtons;
import com.truecar.navigation.HomepageURL;

public class HomePageVerifyOrbButtons {

	WebDriver driver;
	HomePageOrbButtons orbs;
	HomepageURL url;

	@BeforeClass
	public void setup() {
		driver = new FirefoxDriver();
		orbs = new HomePageOrbButtons();
		url = new HomepageURL();
		url.getHomepageURL(driver);
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void homePageVerifyOrbButtonsSelect() throws Exception {

		orbs.orbButtonOne(driver);
		Assert.assertEquals("Never Overpay",
				driver.findElement(By.xpath("//div[@id='content']/header/div/ul/li/div/h1")).getText());

		orbs.orbButtonThree(driver);
		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='content']/header/div/ul/li[3]/div/h1")));
		Assert.assertEquals("TrueCar Certified Dealers",
				driver.findElement(By.xpath("//div[@id='content']/header/div/ul/li[3]/div/h1")).getText());

		orbs.orbButtonFour(driver);
		WebDriverWait waitAgain = new WebDriverWait(driver, 4);
		waitAgain.until(ExpectedConditions.visibilityOfElementLocated(By
				.xpath("//div[@id='content']/header/div/ul/li[4]/div/h1")));
		Assert.assertEquals("Total Transparency",
				driver.findElement(By.xpath("//div[@id='content']/header/div/ul/li[4]/div/h1")).getText());

	}

}
