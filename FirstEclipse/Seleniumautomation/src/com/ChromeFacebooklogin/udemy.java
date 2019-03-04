package com.ChromeFacebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class udemy {

	public static void main(String[] args)
	{
		WebDriver driver = null;
		
		String url = "http://www.udemy.com";
		
		String path = "Become an instructor";
		
		System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get(url);
		
		//<a data-purpose="instructor-dropdown" href="/teaching/?ref=teach_header" rel=" noopener noreferrer" target="_self" id="header.instructor" role="button" class="dropdown-toggle" aria-haspopup="true" aria-expanded="false">Become an instructor</a>
		driver.findElement(By.linkText(path)).click();
		
		driver.close();
		
	}
	
	
	
	
	
	
	
	
	
}
