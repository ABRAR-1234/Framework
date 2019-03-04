package com.Datadriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Newtours {
	
	WebDriver driver = null;
	String url = "http://www.newtours.demoaut.com";
	
	@BeforeTest
	public void Setup() {
		
		
	    System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(url);
		

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void login() throws IOException {
		
		FileInputStream file = new FileInputStream("./src/com/excel/ORM_final_login_excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
        
		int rowcount = sheet.getLastRowNum();
		for(int i = 1;i<=rowcount;i++)
		{
			Row r = sheet.getRow(0);
			
			driver.findElement(By.name("userName")).sendKeys(r.getCell(0).getStringCellValue());
			driver.findElement(By.name("password")).sendKeys(r.getCell(0).getStringCellValue());
			
			driver.findElement(By.name("name")).click();
			
			try {
				
				String expectedresult = "Flight";
				
                 String actualresult = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[1]/td/font/font/b/font/font")).getText();						
                 
				if(actualresult.contains(expectedresult))
				{
				System.out.println("Login Successful--PASS");	
					
				r.createCell(2).setCellValue("PASS");
					
				}
			}
				catch(Exception e)
				{
					String expresult = "Welcome back to Mercury Tours!";
							
					String actresult = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p/font/b")).getText();
					
					if(actresult.equals(expresult))
					{
						System.out.println("Login Successful--PASS");	
						
						r.createCell(2).setCellValue("FAIL");	
						
						File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
						
						String getTiltle = driver.getTitle();
						
						FileHandler.copy(screenshot, new File("./Screenshots/"+getTiltle+".png"));
						
					}
				}
			
			FileOutputStream file1 = new FileOutputStream("./src/Testfiles/newtour_login.xlsx");
			workbook.write(file1);
			
			driver.navigate().back();
			
		}
				
			}
		
			@AfterTest
			public void teardown() {
				
				driver.quit();
			}
		
		
		
		
		
		
		
		

			
			
			
			
			
	
	
	
	
	
	
	

}
