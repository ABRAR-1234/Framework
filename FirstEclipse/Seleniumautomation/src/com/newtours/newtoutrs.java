package com.newtours;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtoutrs {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		String Url = "http://www.newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		
		List<WebElement> totalElements = driver.findElements(By.tagName("a"));
		
		System.out.println("no.of elements:"+totalElements.size());
		
		
		
		
		for(int i=3;i<totalElements.size();i++)
		
		{
	
			
			String getlink = totalElements.get(i).getAttribute("href");
            
		 
		    
		    //driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

				  totalElements.get(i).click();   
				   
					String title = driver.getTitle();
					
					String actualurl = driver.getCurrentUrl();
					
					if(actualurl.equals(getlink))
					{
						System.out.println("the page has directed to:"+title);
						System.out.println("The current url is:"+driver.getCurrentUrl());
					}
					
					
				
		            driver.navigate().back();
				
				
				
			}
			
			 
			
		}
		
		
		
		
		
		
		
		
		
		

	}
