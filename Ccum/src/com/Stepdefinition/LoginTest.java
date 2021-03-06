package com.Stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginTest {

	WebDriver driver = null;
	
	String Url = "http://localhost/orangehrm-2.6/login.php";
	
	@Given("^To open firefox browser and launch URL$")
	public void To_open_firefox_browser_and_launch_URL() throws Throwable {
	    
	
		
		System.setProperty("webdriver.chrome.driver", "./Driverfiles/chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get(Url);
		

	}

	@When("^Enter valid username and password$")
	public void Enter_valid_username_and_password() throws Throwable {

		driver.findElement(By.name("txtUserName")).sendKeys("admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin");
		
		driver.findElement(By.name("Submit")).click();
		
		
	}

	@Then("^Close the browser$")
	public void Close_the_browser() throws Throwable {
	    
		driver.close();
	    
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
