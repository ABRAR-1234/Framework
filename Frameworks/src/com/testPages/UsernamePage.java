package com.testPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UsernamePage {

	@FindBy(xpath="//input[@type='email' and @class='whsOnd zHQkBf']")
	WebElement usrname;
	
	public void Username(String username)
	{
	usrname.sendKeys(username);
	}
	
	@FindBy(xpath = "//*[@id=\"identifierNext\"]/content/span")    
	WebElement next;
	
	public void Next() {
		next.click();
	}
	
	
}
