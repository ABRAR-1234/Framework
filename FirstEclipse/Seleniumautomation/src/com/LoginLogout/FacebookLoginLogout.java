package com.LoginLogout;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLoginLogout {
	
	public static void main(String[] args) throws InterruptedException
	{
	 // WebDriver driver = null;
	  
	  String url = "http://www.facebook.com";
	  
	  System.setProperty("webdriver.gecko.driver", "./Driverfiles/geckodriver.exe");
	  
	 WebDriver driver = new FirefoxDriver();
	  
	  driver.get(url);
	  
	  //<input type="email" class="inputtext" name="email" id="email" value="sye.abr@gmail.com" data-testid="royal_email">
	  
	  driver.findElement(By.id("email")).sendKeys("sye.abr@gmail.com");
	  
	  //<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
	  
	  driver.findElement(By.id("pass")).sendKeys("orange6083");
	  
	  //<input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_8">
	  
		driver.findElement(By.id("loginbutton")).click();
		
		//<a data-gt="{&quot;chrome_nav_item&quot;:&quot;home_chrome&quot;}" href="https://www.facebook.com/?ref=tn_tnmn" class="_2s25" accesskey="1">Home</a>
	
		driver.findElement(By.id("userNavigationLabel")).click();
	
		driver.findElement(By.xpath("//*[@id=\"js_12\"]/div/div/ul/li[8]/a/span/span")).click();
		
		
		
		
	}

}
