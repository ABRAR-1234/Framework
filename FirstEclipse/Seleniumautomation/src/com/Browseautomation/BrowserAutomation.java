package com.Browseautomation;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
                    
		System.setProperty("webdriver.chrome.driver","./Driverfiles/chromedriver.exe");
        ChromeDriver ch = new ChromeDriver();

		System.setProperty("webdriver.gecko.driver","./Driverfiles/geckodriver.exe");
		FirefoxDriver ff = new FirefoxDriver();
		
		 System.setProperty("webdriver.edge.driver","./Driverfiles/MicrosoftWebDriver.exe");
		 EdgeDriver e = new EdgeDriver(); 

		
		
		
	}

}
