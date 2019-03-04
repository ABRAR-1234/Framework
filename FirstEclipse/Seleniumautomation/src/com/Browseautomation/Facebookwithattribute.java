package com.Browseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookwithattribute {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		String Url = "http://www.Linkedin.com";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		
		//<input type="text" name="session_key" class="login-email reg-field__input" autocapitalize="off" tabindex="1" id="login-email" placeholder="Email or phone number" autofocus="autofocus">
		driver.findElement(By.id("login-email")).sendKeys("9962605307");
		
		//<input type="password" name="session_password" class="login-password reg-field__input" id="login-password" aria-required="true" tabindex="1" placeholder="Password">
		
		driver.findElement(By.id("login-password")).sendKeys("9962605307");
		
		//<input tabindex="1" id="login-submit" class="login submit-button" type="submit" value="Sign in" disabled="">
		
		driver.findElement(By.id("login-submit")).click();
		
		driver.close();
		

	}

}
