package com.truecar.navigation;

import org.openqa.selenium.*;

public class HomepageURL  {

public void getHomepageURL(WebDriver driver) { 
	
	driver.get("http://truecar.com");
	String i = driver.getCurrentUrl();
	System.out.println(i);
	
}

}
