package com.truecar.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {

	public void selectAVehicle(WebDriver driver) {

		WebDriverWait wait = new WebDriverWait(driver, 4);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='content']/header/a/span")));
		driver.findElement(By.xpath("//div[@id='content']/header/a/span")).click();
	}

}
