package com.Browseautomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_function_url_xpath {
	
	public static void main(String[] args)
	{
		WebDriver driver = null;
		
		String url = "http://www.facebook.com";
		
		String usrname = "9566114862";
		
		String password = "orange6083";
		
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		
		driver.get(url);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(usrname);
		
		driver.findElement(By.xpath("//*[@id='pass' and @name='pass']")).sendKeys(password);
		
		driver.findElement(By.id("loginbutton")).click();
		
		
		
		String expectedresult = "https://www.facebook.com/";
		
		System.out.println("The expected result is:" +expectedresult);
		
		String actualresult = driver.getCurrentUrl();
		
		if(actualresult.equals(expectedresult))
		{
			System.out.println("login Successful - PASS");
		}
		else {
			System.out.println("login Successful - FAIL");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	

}
