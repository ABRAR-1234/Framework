package com.ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown_with_selection {

	public static void main(String[] args) throws InterruptedException {
        WebDriver driver = null;
		
		String URL = "http://www.echoecho.com/htmlforms11.htm";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//<input name="txtUserName" type="text" class="loginText" tabindex="1">
		
		driver.get(URL);
		
		Thread.sleep(5000);	
		
		WebElement drop = driver.findElement(By.name("mydropdown"));
		
		drop.click();
		
		
		
		
		
		
		
		
		

	}

}
