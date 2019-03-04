package com.Testcase;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.Format;
import java.util.Formatter;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.BaseTest.BaseTest;
import com.Testpages.WelcomeMercurytours;

public class Testcase extends BaseTest{
   
	
	@Test
	public void Newtours() throws IOException {
		
		WelcomeMercurytours wmt = PageFactory.initElements(driver, WelcomeMercurytours.class);
		
		wmt.signon();
		
		driver.navigate().back();
		
		wmt.REGISTER();
		
		driver.navigate().back();
		
        wmt.SUPPORT();
        
        driver.navigate().back();
        
        wmt.contact();
        
        driver.navigate().back();
        
        wmt.Home();
        
        driver.navigate().back();
        
        wmt.Flights();
        
        driver.navigate().back();
        
         wmt.Hotels();
        
        driver.navigate().back();
        
        wmt.CarRentalss();
        
        driver.navigate().back();
        
        wmt.Cruises();
        
        driver.navigate().back();
        
        wmt.Destinations();
        
        driver.navigate().back();
        
       wmt.Vacations();
        
        driver.navigate().back();
        
        wmt.yourdestination();
        
        driver.navigate().back();
        
        wmt.vacationdest();
        
        driver.navigate().back();
        
        wmt.reghere();
        
        driver.navigate().back();
        
        wmt.about();
        
        driver.navigate().back();
        
        wmt.Salon();
        
        driver.navigate().back();
	
		FileInputStream file = new FileInputStream("./src/readexcelfiles/New_tours_login_excel.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rcount = sheet.getLastRowNum();
		
		DataFormatter form = new DataFormatter();
		
		for(int i=1;i<=rcount;i++)
		{
			Row r = sheet.getRow(i);
			
			Cell c = r.getCell(0);
			String cell0 = form.formatCellValue(c);
			
			Cell c1 = r.getCell(1);
			String cell1 = form.formatCellValue(c1);
			
			wmt.Signin(cell0,cell1);
			
			driver.navigate().back();
			
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
						System.out.println("Login Successful--FAIL");	
						
						r.createCell(2).setCellValue("FAIL");	
						
						String getTiltle = driver.getTitle();
						
						File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

						FileHandler.copy(screenshot, new File("./Screenshot/Loginfailed.png"));
						
					}
				}
			
			FileOutputStream file1 = new FileOutputStream("./src/writeexcelfiles/New_tours_login_write.xlsx");
			workbook.write(file1);
				
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	

