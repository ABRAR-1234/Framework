package com.newtours;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class header_section {

	public static void main(String[] args) {
		
WebDriver driver = null;
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("http://www.newtours.demoaut.com");
		
		  List<WebElement> elements= driver.findElements(By.tagName("a"));
		
		  System.out.println("The total no.of elements are:" +elements.size());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
