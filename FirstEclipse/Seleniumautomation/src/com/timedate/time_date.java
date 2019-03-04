package com.timedate;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class time_date {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		
		String URL = "http://www.timeanddate.com/worldclock/";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		
		///html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table
		
		WebElement Table = driver.findElement(By.xpath("/html/body/div[1]/div[6]/section[1]/div/section/div[1]/div/table"));
		
		List<WebElement> rows= Table.findElements(By.tagName("tr"));
		
		System.out.println(rows.size());
		
		for(int i = 0;i<rows.size();i++)
		{
			List<WebElement> column = rows.get(i).findElements(By.tagName("td"));
			for(int k=0;k<column.size();k++)
			{
				String colname = column.get(k).getText();
				System.out.println(colname);
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
