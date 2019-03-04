package com.window;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Naukri_multiple_windows {

	public static void main(String[] args) {
		
	    WebDriver driver = null;
		
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		// To open browser
		driver=new FirefoxDriver();
		// To maximize browser
		driver.manage().window().maximize();
		// To open Naukri website with multiple windows
		driver.get("http://www.naukri.com/");
		// It will return the parent window name as a String
		String mainWindow=driver.getWindowHandle();
		// It returns no. of windows opened by WebDriver and will return Set of Strings
		Set<String> set =driver.getWindowHandles();
		// Using Iterator to iterate with in windows
		Iterator<String> itr= set.iterator();
		while(itr.hasNext()){
			String childWindow=itr.next();
		   	// Compare whether the main windows is not equal to child window. If not equal, we will close.
			if(!mainWindow.equals(childWindow)){
			driver.switchTo().window(childWindow);
			System.out.println(driver.switchTo().window(childWindow).getTitle());
			driver.close();

			driver.switchTo().window(mainWindow);
	}
		}
}
}