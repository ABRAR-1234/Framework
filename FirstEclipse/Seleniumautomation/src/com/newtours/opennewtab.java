package com.newtours;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opennewtab {
	
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.newtours.demoaut.com");
		
		  List<WebElement> elements= driver.findElements(By.tagName("a"));
		
		  System.out.println("The total no.of elements are:" +elements.size());
		  
		  // Set<String> tabs = driver.getWindowHandles();		
		  
		  for(int i = 0;i<elements.size();i++)
		  {
			 	  
			  elements= driver.findElements(By.tagName("a"));
			  
			  Thread.sleep(4000);
			  String link = elements.get(i).getAttribute("href");
			  driver.navigate().to(link);
			  
			 Thread.sleep(10000);
			 String actualurl = driver.getCurrentUrl();
			 
			 String title = driver.getTitle();
			 System.out.println("The title of page is:"+i+" " +title);
	
			System.out.println("The current url is:"+i+" "+ actualurl);
			
			driver.navigate().back();
           Thread.sleep(10000);
			
		  }
		  
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
