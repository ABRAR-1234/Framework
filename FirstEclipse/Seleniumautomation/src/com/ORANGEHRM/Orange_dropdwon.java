package com.ORANGEHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Sleeper;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Orange_dropdwon {

	public static void main(String[] args) throws InterruptedException {
	  
		WebDriver driver = null;
		
		String URL = "http://localhost/orangehrm-2.6";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//<input name="txtUserName" type="text" class="loginText" tabindex="1">
		
		driver.get(URL);
		
		
		
		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.name("Submit")).click();
		
		
         		
           Thread.sleep(5000);
		
		  /* WebElement rec= driver.findElement(By.linkText("Recruitment"));
		   
		   Actions act = new Actions(driver);*/
		   
		   //act.moveToElement(rec).perform();
		   
		  // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		   
		   //WebElement job = driver.findElement(By.linkText("Job Vacancies"));
		   
		   //job.click();
		   
		  WebElement bug = driver.findElement(By.linkText("Bug Tracker"));
		  
		  bug.click();
		  
		// WebDriverWait wait = new WebDriverWait(driver, 15);
		 
		 //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='category_id']")));
		  
		  Thread.sleep(10000);
		  
		  WebElement Category = driver.findElement(By.xpath("//select[@id='category_id']"));
		  
		  Category.click();
		   
		   
		
		
	
		
		
		
		
		

	}

}
