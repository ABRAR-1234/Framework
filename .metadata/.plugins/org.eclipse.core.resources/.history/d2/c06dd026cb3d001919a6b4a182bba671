package com.Gmailtestcase;

import java.io.IOException;

import javax.xml.bind.JAXB;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.mailattach.BaseTest;
import com.testPages.Inbox;
import com.testPages.Password;
import com.testPages.UsernamePage;

public class sendmailattch extends BaseTest{

	@Test
	public void Composemailattch() throws InterruptedException, IOException  {
		
		UsernamePage usr = PageFactory.initElements(driver, UsernamePage.class);
		
		usr.Username("sye.abr@gmail.com");
		
		usr.Next();
		
		Password pss = PageFactory.initElements(driver, Password.class);
		
		pss.passwd("orange6083");
		
		pss.nxt();
		
		Inbox inb = PageFactory.initElements(driver, Inbox.class);
		
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"hist_frame\"]")));
		
		inb.Compose();
		
		
		inb.to("bharatlokhande394@gmail.com", driver);
		 
	    Thread.sleep(4000);
	    
		inb.Subject("Excel file");
		
		Thread.sleep(3000);
        		
		inb.attach();

		java.lang.Runtime.getRuntime().exec("./autoit/GmailAutoIt.exe");
		
		Thread.sleep(5000);
		
		inb.Send();
		
		Thread.sleep(4000);
		
		inb.Label();
		
		inb.SignOut();
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
