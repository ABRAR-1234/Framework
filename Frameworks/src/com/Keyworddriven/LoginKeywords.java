package com.Keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginKeywords {

	WebDriver driver = null;
    String URL = "http://localhost/orangehrm-2.6/login.php";
	
	
	public void LaunchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
	     driver = new ChromeDriver();
		
	}
	
	public void navigate()
	{
		
		driver.get(URL);
	}
	
	public void Enterusername() throws IOException {
		

        FileInputStream file = new FileInputStream("./src/readexcelfiles/ORM_final_login_excel.xlsx");
		
		XSSFWorkbook wrkbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		 Row r = sheet.getRow(2);
			
	    String user = r.getCell(0).getStringCellValue();
		
	    driver.findElement(By.name("txtUserName")).sendKeys(user);
		
		
	}
	
	
      public void Enterpassword() throws IOException {
		

        FileInputStream file = new FileInputStream("./src/readexcelfiles/ORM_final_login_excel.xlsx");
		
		XSSFWorkbook wrkbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		
		
		
		 Row r = sheet.getRow(2);
			
	    String pass = r.getCell(1).getStringCellValue();
		
	    driver.findElement(By.name("txtPassword")).sendKeys(pass);
		
		
	}
	
	
	public void Click() {

		driver.findElement(By.name("Submit")).click();
	
	}
	
	
	
	
	
	
	
	
	
	
}
