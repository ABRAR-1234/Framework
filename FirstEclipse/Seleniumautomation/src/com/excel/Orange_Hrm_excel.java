package com.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
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

public class Orange_Hrm_excel {

	public static void main(String[] args) throws IOException,InterruptedException{

        WebDriver driver = null;
		
		String URL = "http://localhost/orangehrm-2.6/login.php";
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	      
        WebElement name = driver.findElement(By.name("txtUserName"));
        
		WebElement pasword = driver.findElement(By.name("txtPassword"));
		
		 WebElement submit = driver.findElement(By.name("Submit"));
	
		
		FileInputStream file = new FileInputStream("./src/com/excel/ORM_final_login_excel.xlsx");
		
		XSSFWorkbook wrkbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
		System.out.println(rowcount);
		
		for(int i = 1;i<=rowcount;i++)
		{
	        Row r = sheet.getRow(i);
	
			Cell c = r.getCell(0);
		
	        String admin = c.getStringCellValue();
	        
	        String password = r.getCell(1).getStringCellValue();
          
	          name.sendKeys(admin);

			 pasword.sendKeys(password);
			  
	         submit.click();

             Thread.sleep(5000);
	         
	         try
	         {
	
		            String expectedreslt = "Welcome";

		            WebElement Welcome = driver.findElement(By.xpath("//*[@id=\"option-menu\"]/li[1]"));
		 
					String actualresult = Welcome.getText();
					
					if(actualresult.contains(expectedreslt))
					{
						System.out.println("Login Successful=PASS");
						
						Cell newresult = r.createCell(2);
						
						newresult.setCellValue("PASS");
						
						driver.findElement(By.linkText("Logout")).click();
					}
	         }
	        
	         
	        catch(Exception e){

	        	   WebElement invaidlogin = driver.findElement(By.xpath("//*[@id=\"Table_01\"]/tbody/tr[1]/td[2]/table/tbody/tr[5]/td[2]/strong/font"));
	        	   
	        	   String ifinvalid = invaidlogin.getText();
	        	   
	        	   if(ifinvalid != null)
	        	   {
	               System.out.println("Login Unsuccessful=FAIL");
					
					Cell newresult = r.createCell(2);
					
					newresult.setCellValue("FAIL");
					
					Thread.sleep(2000);
					
					File Screensht = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					
					FileHandler.copy(Screensht, new File("./Screenshots/"+ifinvalid+""+i+".png"));

	         }
           
	        }
			
			FileOutputStream file1 = new FileOutputStream("./src/com/excel/write.xlsx");
			wrkbook.write(file1);
			
			Thread.sleep(5000);
	        
			driver.get(URL);

			name = driver.findElement(By.name("txtUserName"));
			
			 pasword = driver.findElement(By.name("txtPassword"));
			 
			 submit = driver.findElement(By.name("Submit"));
	          
		
	    
		}
	}}
		
		
		
		
		
		
		
		
	
