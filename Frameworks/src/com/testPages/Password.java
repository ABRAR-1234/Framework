package com.testPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Password {

   @FindBy(xpath = "//*[@id=\"password\"]/div[1]/div/div[1]/input")
   WebElement password;
   
   public void passwd(String pwd)
   {
	   password.sendKeys(pwd);
   }
	
	
	@FindBy(xpath = "//*[@id=\"passwordNext\"]/content")
	WebElement nxt;
	
	public void nxt() {
		nxt.click();
		
	}
	
	
	
	
	
	
}
