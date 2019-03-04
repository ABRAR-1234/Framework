package com.Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {

	public static void main(String[] args) throws InterruptedException {
		
		
	   WebDriver driver = null;
		
		String URL = "http://localhost/orangehrm-2.6";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//<input name="txtUserName" type="text" class="loginText" tabindex="1">
		
		driver.get(URL);
		
		//<input name="txtUserName" type="text" class="loginText" tabindex="1">
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		//<input name="txtPassword" type="password" class="loginText" tabindex="2">
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		//<input type="Submit" name="Submit" value="Login" class="button" tabindex="3">
		
		driver.findElement(By.name("Submit")).click();
		
		
		//http://localhost/orangehrm-2.6/index.php
		
		
		String expectedresult = "http://localhost/orangehrm-2.6/index.php";
		
		String actualresult = driver.getCurrentUrl();
		
		if(actualresult.equals(expectedresult)) {
			System.out.println("Login Succesful");
		}
		else {
			System.out.println("login Unsuccessful");
			
		}
		
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Logout")).click();
		
		

	}

}
