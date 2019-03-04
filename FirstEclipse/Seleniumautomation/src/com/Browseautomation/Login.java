package com.Browseautomation;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) {
		
		
		WebDriver driver = null;
		
		String url = "https://www.linkedin.com/";
		
		String URL = "https://www.facebook.com";

		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.id("login-email")).sendKeys("9962605307");
		
		driver.findElement(By.id("login-password")).sendKeys("9962605307");
		
		driver.findElement(By.id("login-submit")).click();
		}

}
