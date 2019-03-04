package com.testPages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Inbox {

 @FindBy(xpath= "//div[text()='Compose']")         ////*[@id=\":k7\"]/div/div  
 WebElement compose;
 
 public void Compose()
 {
	 compose.click();
 }
	
 @FindBy(xpath = "//textarea[@name = 'to']")
 WebElement To;
 
 public void to(String to,WebDriver driver) {
	 
	 WebDriverWait wait1 = new WebDriverWait(driver,10);
	   
	 To = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//textarea[@name = 'to']")));

	 To.sendKeys(to);

	 Actions act= new Actions(driver);

	 act.moveToElement(To).sendKeys(Keys.ENTER);
	 
 }
	
 @FindBy(xpath = "//input[@name = 'subjectbox' and @placeholder = 'Subject']")
 WebElement sub;
 
 public void Subject(String Subj) {
	 
	 sub.sendKeys(Subj);
 }
	
 @FindBy(xpath = "//*[@id=\":rg\"]")
 WebElement attch;
 
 
 public void attach() {
	 attch.click();
 }
 
 @FindBy(xpath = "//*[@id=\":po\"]")
 WebElement Send;
 
 public void Send() {
	 Send.click();//
 }
 
 
 @FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a/span")
 WebElement label;
 
 public void Label() {
	 label.click();
 }
 
 
 @FindBy(linkText = "Sign out")
 WebElement logout;
 
 public void SignOut() {
	 logout.click(); 
 }
 
 
 
	
	
	
	
	
	
	
}
