package com.apsrtc;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class simple_screen {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		WebDriver driver = null;
		
        String Url = "https://apsrtconline.in/oprs-web/guest/home.do?h=1";
		
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		
		Thread.sleep(10000);
		
		File simple = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(simple, new File("./Screenshots/simple.png"));
		
		
		
		driver.close();
		
		
		

	}

}
