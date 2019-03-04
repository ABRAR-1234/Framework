package com.ORANGEHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class table {

	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver = null;
		
		String URL = "http://localhost/orangehrm-2.6";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.name("Submit")).click();
		
		 WebElement PIM = driver.findElement(By.linkText("PIM"));
		 
		 Actions act = new Actions(driver);
		 
		 act.moveToElement(PIM).perform();
		 
		 WebElement Emplist = driver.findElement(By.linkText("Employee List"));
		 
		 Emplist.click();
		 
		 
		 ////*[@id="standardView"]/div[3]/div[1]/input[1]
		 
		 Thread.sleep(10000);
		 
		 driver.findElement(By.id("standardView")).click();
		 
		 driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("Ahmed");
		 
		 act.sendKeys(Keys.TAB).perform();
		 
		 act.sendKeys("Syed").perform();
		 
		 act.sendKeys("Abrar").perform();
		 
		 act.sendKeys("Syd").perform();
		 
		 
		//*[@id="btnEdit"]
		 
		 driver.findElement(By.xpath("//*[@id=\"btnEdit\"]")).click();
		 
		 
		 
		 
		
		 
		 
		 
		 
		
		
		
		
		
	}
	
	
	
}
