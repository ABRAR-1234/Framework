package com.orange2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseTest {
	
	WebDriver driver = null;
	
	String Url = "http://localhost/orangehrm-2.6/login.php";
	
	@BeforeTest
	public void setup() {
		
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
         driver = new ChromeDriver();
         driver.get(Url);
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void teardown() {
		
	driver.close();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
