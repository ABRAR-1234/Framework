package com.Keystesting;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login_using_keys {

	public static void main(String[] args) {
	
		
		WebDriver driver = null;
		
		String Url = "http://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		
		
		driver.findElement(By.id("email")).sendKeys("sye.abr@gmail.com");
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.TAB).perform();
		
		act.sendKeys("orange6083").perform();
		
		act.sendKeys(Keys.ENTER).perform();
		
		
		
		
		
		
		
		

	}

}
