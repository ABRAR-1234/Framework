package com.LoginLogout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkedIn {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		String Url = "http://www.linkedin.com";
		
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get(Url);
		
		
		driver.findElement(By.id("login-email")).sendKeys("9962605307");
		
		driver.findElement(By.id("login-password")).sendKeys("9962605307");
		
		driver.findElement(By.id("login-submit")).click();
		
		String expectedresult = "Home";
		
		System.out.println("The expected result");
				
		WebElement expectedtext = driver.findElement(By.id("feed-tab-icon"));
		
		String expectedresult1 = expectedtext.getClass();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
