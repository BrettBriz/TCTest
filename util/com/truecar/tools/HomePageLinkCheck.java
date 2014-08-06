package com.truecar.tools;

import java.util.List;

import org.openqa.selenium.*;

public class HomePageLinkCheck {

	public void getHomePageLinks(WebDriver driver) {

		List<WebElement> alllinks = driver.findElements(By.tagName("a"));

		for (int i = 0; i < alllinks.size(); i++)
			System.out.println(alllinks.get(i).getText());

		for (int i = 0; i < alllinks.size(); i++) {
			alllinks.get(i).getTagName();
			alllinks.get(i).getText();
		}

	}

}
