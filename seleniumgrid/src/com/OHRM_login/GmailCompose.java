package com.OHRM_login;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailCompose {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		
		WebDriver driver = null;
		
        String Url = "http://gmail.com";
        
    		
    		System.setProperty("webdrivr.chrome.driver", "./Driverfiles/chromedriver.exe");
    		
    		driver = new ChromeDriver();
    		
    		driver.manage().window().maximize();
    		
    		driver.get(Url);
    		
    		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
		    WebElement Username = driver.findElement(By.xpath("//input[@type='email' and @class='whsOnd zHQkBf']"));
		    
		    Username.sendKeys("sye.abr@gmail.com");
		
		    
		    driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		
		    ////*[@id="password"]/div[1]/div/div[1]/input
		    
		    WebElement passwrd = driver.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input"));
		    
		    passwrd.sendKeys("orange6083");
		    
		    driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		    
		    Thread.sleep(5000);
		   
		    ////*[@id=":kg"]/div/div
		    
		    driver.findElement(By.xpath("//div[text()='Compose']")).click();
		    
		 //  WebElement To =  driver.findElement(By.xpath("//div[@id = ':q9']"));
		   
		   WebDriverWait wait = new WebDriverWait(driver,10);
		   
		   WebElement to = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name = 'to']")));
		   
		   to.sendKeys("bharatlokhande394@gmail.com");
		   
		   Actions act= new Actions(driver);
		   
		   Thread.sleep(4000);
		   
		   act.moveToElement(to).sendKeys(Keys.ENTER);
	
		   WebElement Subject = driver.findElement(By.xpath("//input[@name = 'subjectbox' and @placeholder = 'Subject']"));
		    
		   Subject.sendKeys("Excel file"); 
		    
		   WebElement Attach = driver.findElement(By.xpath("//*[@id=\":rg\"]"));
		   
		   Attach.click();
		  
		   java.lang.Runtime.getRuntime().exec("./autoit/GmailAutoIt.exe");
		   
		   Thread.sleep(5000);
		   
		   WebElement send = driver.findElement(By.xpath("//div[@id = ':po']"));
		    
		   send.click();  
		    
		   WebElement label = driver.findElement(By.xpath("//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span"));
		   
		   label.click();
		   
		   //Sign out
		   
		   WebElement SignOut = driver.findElement(By.linkText("Sign out"));
		   
		   SignOut.click();
		   
		   Thread.sleep(2000);
		   
		//   Alert alt = driver.switchTo().alert();
		   
		 //  alt.accept();
		   
		   driver.close();
		    
		    
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
