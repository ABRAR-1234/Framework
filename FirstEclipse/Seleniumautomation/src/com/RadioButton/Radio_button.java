package com.RadioButton;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_button {

	public static void main(String[] args) throws InterruptedException
	{
WebDriver driver = null;
		
		String URL = "http://www.echoecho.com/htmlforms10.htm";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		WebElement table = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td"));
		
		//<input type="checkbox" name="option1" value="Milk">
		//<input type="checkbox" name="option2" value="Butter" checked="">
		//<input type="checkbox" name="option3" value="Cheese">
		
		List<WebElement> radiobuttons = table.findElements(By.name("group1"));
		
		for(int i=0;i<radiobuttons.size();i++)
		{
			radiobuttons.get(i).click();
			Thread.sleep(5000);
			for(int k=0;k<radiobuttons.size();k++) {
				System.out.println(radiobuttons.get(k).getAttribute("value") + " " + radiobuttons.get(k).getAttribute("checked"));	
			}
		}
		
		
		
		
		
		
		
	}
	
	
	
}
