package com.ChromeFacebooklogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFunctionality {
	
	public static void main(String[] args)
	{
		
		WebDriver driver = null;
		String Url = "http://www.facebook.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(Url);
		
		//<input type="email" class="inputtext" name="email" id="email" data-testid="royal_email">
		
		driver.findElement(By.id("email")).sendKeys("9962605307");
		//<input type="password" class="inputtext" name="pass" id="pass" data-testid="royal_pass">
		
		driver.findElement(By.id("pass")).sendKeys("orange6083");
		
		//<label class="uiButton uiButtonConfirm" id="loginbutton" for="u_0_2"><input value="Log In" aria-label="Log In" data-testid="royal_login_button" type="submit" id="u_0_2"></label>
		driver.findElement(By.className("inputtext")).click();
		
		String expectedresult = "Facebook";
		System.out.println("the expected result is:" +expectedresult);
		
		String actualresult = driver.getTitle();
		System.out.println("The actual result is:" +actualresult);
		
		if(actualresult.contains(expectedresult))
		{
			System.out.println("Login Successful - PASS");
		}
		else {
			System.out.println("Login failed - FAIL");
		}
		driver.close();
	
	}
	

}
