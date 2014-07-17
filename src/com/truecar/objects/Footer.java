package com.truecar.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Footer {
	
	public void dealerLogin (WebDriver driver){
		
		driver.findElement(By.linkText("Dealer Portal Login")).click();
		
	}
	
}
