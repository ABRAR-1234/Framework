package com.orange2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Login_addEmployee extends BaseTest {
	
	@Test(enabled = false)
   public void login() throws InterruptedException, IOException {
	
        FileInputStream file = new FileInputStream("./src/readexcelfiles/ORM_final_login_excel.xlsx");
		
		XSSFWorkbook wrkbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = wrkbook.getSheet("Sheet1");
		
		int rowcount = sheet.getLastRowNum();
		
	    WebElement name = driver.findElement(By.name("txtUserName"));
	        
		WebElement pasword = driver.findElement(By.name("txtPassword"));
			
		WebElement submit = driver.findElement(By.name("Submit"));
	    
		
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
	               
					FileHandler.copy(Screensht, new File("./Screenshot/login_failed.png"));      
	              }
          
	           }
		    FileOutputStream file1 = new FileOutputStream("./src/writeexcelfiles/OHRM_login_write.xlsx");
			
			wrkbook.write(file1);
			
			Thread.sleep(5000);
	        
			driver.get(Url);

			name = driver.findElement(By.name("txtUserName"));

			pasword = driver.findElement(By.name("txtPassword"));
			 
			submit = driver.findElement(By.name("Submit"));
		}
	
	
	
}
	
	@Test(priority = 1)
	public void addEmployee() throws IOException, InterruptedException {
		
	      driver.findElement(By.name("txtUserName")).sendKeys("admin");
      
		  driver.findElement(By.name("txtPassword")).sendKeys("admin");
			
		  driver.findElement(By.name("Submit")).click();

		  WebElement PIM = driver.findElement(By.linkText("PIM"));
		  
		  Actions act = new Actions(driver);
 

        FileInputStream file1 = new FileInputStream("./src/readexcelfiles/AddEmployee_Valid_Invalid_data.xlsx");
        
        XSSFWorkbook book = new XSSFWorkbook(file1);
        
        XSSFSheet Sheet = book.getSheet("Sheet1");
        
        int rowcount = Sheet.getLastRowNum();
        

        for(int i=1;i<=rowcount;i++)
        {
      	  
      	Row r1 = Sheet.getRow(i);
      	
      	PIM = driver.findElement(By.linkText("PIM"));
      	
        act.moveToElement(PIM).perform();

        WebElement addEmployee = driver.findElement(By.linkText("Add Employee"));
      	
      	addEmployee.click();
      	 
      	Thread.sleep(5000);
      	
      //	WebElement codeadd = driver.findElement(By.id("txtEmployeeId"));

      	driver.findElement(By.xpath("//*[@id=\"txtEmpLastName\"]")).sendKeys(r1.getCell(0).getStringCellValue());
      	
      	driver.findElement(By.name("txtEmpFirstName")).sendKeys(r1.getCell(1).getStringCellValue());
      	
      	driver.findElement(By.name("txtEmpMiddleName")).sendKeys(r1.getCell(2).getStringCellValue());
      	
      	driver.findElement(By.id("btnEdit")).click();

      	
 
        }
	

}
}
