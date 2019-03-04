package com.Browseautomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getsource {

	public static void main(String[] args) {
	
		WebDriver driver = null;
		
		String Url = "http://www.google.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		
		String word = "Gmail";
		
		String word1 = driver.getPageSource();
		
		if(word1.contains(word))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		
		

	}

}
