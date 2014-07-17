package com.truecar.objects;

import org.openqa.selenium.*;

public class HomePageOrbButtons {
	
	public void orbButtonOne (WebDriver driver){
		driver.findElement(By.xpath("//ol/li")).click();
		
	}
	
	public void orbButtonTwo (WebDriver driver){
		driver.findElement(By.xpath("//ol/li[2]")).click();

		
	}
	
	public void orbButtonThree (WebDriver driver){
		driver.findElement(By.xpath("//ol/li[3]")).click();

	}
	
	public void orbButtonFour (WebDriver driver){
		driver.findElement(By.xpath("//ol/li[4]")).click();

		
	}

}
