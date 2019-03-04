package com.excel;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Newtours_Excel {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = null;
		
        String Url = "http://www.newtours.demoaut.com";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		
		WebElement register = driver.findElement(By.linkText("REGISTER"));
		
		register.click();
		
		Thread.sleep(5000);
		
		WebElement country = driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[5]/td/form/table/tbody/tr[12]/td[2]/select"));
		
		
		List<WebElement> countries = country.findElements(By.tagName("option"));
		
		countries.size();
		
		System.out.println("The total number of countries are:"+countries.size());
		
		String[] countryarr = new String[countries.size()];
		
		for(int i = 0;i<countryarr.length;i++)
		{
			countryarr[i] = countries.get(i).getText();
			
			System.out.println(countryarr[i]);		
		}
		
		
		FileInputStream file = new FileInputStream("./src/com/excel/Countries_dropdown.xlsx");
		
		XSSFWorkbook book = new XSSFWorkbook(file);
		
		XSSFSheet Sheet = book.getSheet("Sheet1");
		
		 Row r = Sheet.createRow(0);
		
		int i=0;
	    
		while(i<countryarr.length)
		{
	      Cell c = r.createCell(i);
	      c.setCellValue(countryarr[i]);
	      i++;
		}
		
		FileOutputStream fil = new FileOutputStream("./src/com/excel/Countries_dropdown.xlsx");
		book.write(fil);
		
		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
