package com.Browseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute {

	
	public static void main(String[] args)
	{
WebDriver driver = null;
		
		String Url = "http://www.newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		
		driver.findElement(By.linkText("REGISTER")).click();
		
		String acttual = driver.getCurrentUrl();
		
		//<a href="mercuryregister.php?osCsid=420ab6ecca96ec45156f4853860f01c4">REGISTER</a>
		String attr = driver.findElement(By.linkText("REGISTER")).getAttribute("href");
		
		System.out.println(attr);
		
		if(acttual.equals(attr))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
	
}
