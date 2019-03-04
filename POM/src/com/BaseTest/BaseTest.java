package com.BaseTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {

	
	public WebDriver driver = null;
	
	public String Url = "http://newtours.demoaut.com/";
	
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
