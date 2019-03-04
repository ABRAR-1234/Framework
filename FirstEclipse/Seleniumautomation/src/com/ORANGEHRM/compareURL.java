package com.ORANGEHRM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class compareURL {

	public static void main(String[] args) throws InterruptedException{
		
		WebDriver driver = null;
		
		String URL = "http://localhost/orangehrm-2.6";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("123");
		
		
	 
	    	 try {
	    		    driver.findElement(By.name("Submit")).click();
	    			
	    	        String expectedresult = "http://localhost/orangehrm-2.6/index.php";
	    			
	    		     String actualresult = driver.getCurrentUrl();

	    		     
	    	     if(actualresult.equals(expectedresult))
	    	     {
	    	    	 System.out.println("Test successful"); 
	    	     }
	    	     else
	    		 {
	    			 File Screen = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    			 FileHandler.copy(Screen, new File("./Orange_hrm/login.png"));
	    		 }
	    	     
	    	 }
	    	    catch (Exception e)
	    	 {
	    	    	
	    	    	System.out.println("An exception has occured");
	    	    		 
	    	 }
	    	 
	     
		 
		
		 
		 
			
	
		
		
		
		
		
		
	    	    		 }

	}

