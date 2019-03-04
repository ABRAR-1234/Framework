package com.apsrtc;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Heade_automate_links {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
	WebDriver driver = null;
		
		String Url = "https://apsrtconline.in/oprs-web/guest/home.do?h=1";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
	
		WebElement header = driver.findElement(By.className("menu"));
		
		List<WebElement> LinkElements = header.findElements(By.tagName("a"));
		
		System.out.println("The count of the links are:" +LinkElements.size());
		
		String arr[] = new String[LinkElements.size()];
		
		System.out.println(arr.length);
		
		for(int i = 0;i<LinkElements.size();i++)
		{

			//WebDriverWait wait=new WebDriverWait(driver, 10);
			
            header = driver.findElement(By.xpath("/html/body/div[3]/div"));
            
            Thread.sleep(1000);
            
		     LinkElements = header.findElements(By.tagName("a"));
			
			arr = new String[LinkElements.size()];
			
			
			
			if(LinkElements.get(i).isDisplayed())
			{
			arr[i] = LinkElements.get(i).getText();
			}
			
			String name = arr[i];
			
			String newname = removesplcase(name);
			
			
			Thread.sleep(5000);
			
			String Attr = LinkElements.get(i).getAttribute("href");
			
			driver.navigate().to(Attr);
	
			Thread.sleep(10000);
			
		     File Screen_shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		     FileHandler.copy(Screen_shot, new File("./Screenshots/"+newname+".png"));
		     
		     
		     Thread.sleep(2000);
		     
		     String Currenturl = driver.getCurrentUrl();
				
			 String title = driver.getTitle();
		     
		     System.out.println("The Cureent Url of"+arr[i]+"the page is:"+Currenturl);
		     System.out.println("The title of the page is:"+title);
		     System.out.println("The name is:"+newname);
		     System.out.println();

		     driver.get(Url);
		     

		}
			
		 driver.close();	

	}
	
	
	
	public static String removesplcase(String arrvalue)
	{
		Pattern pattern = Pattern.compile("[^a-z A-Z]");
		Matcher matcher = pattern.matcher(arrvalue);
		String value = matcher.replaceAll("");
		return value;
	}
	
	
	
	
	
	
	

}
