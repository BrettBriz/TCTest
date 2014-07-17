package com.truecar.tools;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

public class CookieTool {
	
	public void cookieCheck (WebDriver driver) {
		
		Set<Cookie> cookies = driver.manage().getCookies();
		Iterator<Cookie> itr = cookies.iterator();

		    while (itr.hasNext()){
		    Cookie c = itr.next();
		    System.out.println("Cookie Name: " + c.getName() + " --- " + "Cookie Domain: " + c.getDomain() + " --- " + "Cookie Value: " + c.getValue());
		    }
		
	}

}
