package com.Keyworddriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class LoginTest {

	
	@Test
	public void loginFunction() throws IOException {
		
		LoginKeywords key = new LoginKeywords();
		
		FileInputStream	file = new FileInputStream("./src/readexcelfiles/orm_LOGINFUNCTION_KEYWORD.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
	
		for(int i=1;i<=rowcount;i++)
		{
			
			Row r = sheet.getRow(i);
			
			 String RunMode = r.getCell(4).getStringCellValue();
			
			if(RunMode.equals("Y"))
			{
			 String keyword = r.getCell(3).getStringCellValue();
			 
			 if(keyword.equals("LaunchBrowser"))
			 {
				 key.LaunchBrowser();
			 }
			 else if(keyword.equals("navigate"))
			 {
				 key.navigate();
			 }
			 else if(keyword.equals("Enterusername"))
			 {
				 key.Enterusername();
			 }	 
			 else if(keyword.equals("Enterpassword"))
			 {
				 key.Enterpassword();
			 }	 
			 else if(keyword.equals("Click"))
			 {
				 key.Click();
			 }
				
		
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
