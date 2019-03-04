package com.ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ADmin_dropdown {
	
	public static void main(String[] args) throws InterruptedException
	{
	
	WebDriver driver = null;
	
	String URL = "https://www.indiamart.com/";
	
	System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	
	driver.get(URL);
	
	WebElement button = driver.findElement(By.id("searchPlaceDP"));
	
	button.click();
	
	//<input type="text" placeholder="Search your city" id="searchPlaceInput" class="srin ui-autocomplete-input" autocomplete="off" role="textbox" aria-autocomplete="list" aria-haspopup="true">
	
    Thread.sleep(1000);
    
    
    WebElement search = driver.findElement(By.id("searchPlaceInput"));
    
    search.sendKeys("Che");
    
    Thread.sleep(2000);
    WebElement chennai = driver.findElement(By.partialLinkText("nnai"));
    
    chennai.click();
    
    
    
	
	
	}
}
