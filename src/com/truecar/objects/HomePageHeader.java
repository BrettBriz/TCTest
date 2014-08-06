package com.truecar.objects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageHeader {

	public void shopUsed(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Shop Used")));
		driver.findElement(By.linkText("Shop Used")).click();
	}

	public void login(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Sign In")));
		driver.findElement(By.linkText("Sign In")).click();
	}

	public void liveAgent(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("live_agent")));
		driver.findElement(By.id("live_agent")).click();

	}

}
