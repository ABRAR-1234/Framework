package com.Browseautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class URLautomate {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		String url = "http://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to(url);
		
		driver.close();
		
		
		
		
		
	}
	
	
}
