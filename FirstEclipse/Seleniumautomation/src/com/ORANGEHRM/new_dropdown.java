package com.ORANGEHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class new_dropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = null;

		String url = "http://localhost/orangehrm-2.6/login.php";
		
        System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//<input name="txtUserName" type="text" class="loginText" tabindex="1">
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get(url);
		
        driver.findElement(By.name("txtUserName")).sendKeys("admin");
		
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.name("Submit")).click();
		
		WebElement admin = driver.findElement(By.linkText("Admin"));
		
		Actions act = new Actions(driver);
		
		
		act.moveToElement(admin).perform();
		
		WebElement job = driver.findElement(By.linkText("Job"));
		
		act.moveToElement(job).perform();
		

		
		WebElement jobtitle = driver.findElement(By.linkText("Job Titles"));
		
		jobtitle.click();
		
		
		WebElement dropdown = driver.findElement(By.id("loc_code"));
		
		dropdown.click();
		
		

	}

}
