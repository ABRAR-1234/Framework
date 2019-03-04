package com.Testpages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomeMercurytours {

	
	@FindBy(linkText="SIGN-ON")
	WebElement signon;
	
	public void signon() {
		signon.click();
	}

	@FindBy(linkText="REGISTER")
	WebElement register;
	
	public void REGISTER() {
		register.click();
	}

	@FindBy(linkText="SUPPORT")
	WebElement support;
	
	public void SUPPORT() {
		support.click();
	}
	
	@FindBy(linkText="CONTACT")
	WebElement contact;
	
	public void contact() {
		contact.click();
	}
	
	@FindBy(linkText="Home")
	WebElement home;
	
	public void Home() {
		home.click();
	}
	
	@FindBy(linkText="Flights")
	WebElement flight;
	
	public void Flights() {
		flight.click();
	}
	
	@FindBy(linkText="Hotels")
	WebElement hotel;
	
	public void Hotels() {
		hotel.click();
	}
	
	@FindBy(linkText="Car Rentals")
	WebElement Carrent;
	
	public void CarRentalss() {
		Carrent.click();
	}
	
	@FindBy(linkText="Cruises")
	WebElement cruise;
	
	public void Cruises() {
		cruise.click();
	}
	
	@FindBy(linkText="Destinations")
	WebElement dest;
	
	public void Destinations() {
		dest.click();
	}
	
	@FindBy(linkText="Vacations")
	WebElement vact;
	
	public void Vacations() {
		vact.click();
	}
	
	@FindBy(linkText="your destination")
	WebElement yourdest;
	
	public void yourdestination() {
		yourdest.click();
	}
	
	
	@FindBy(linkText="featured vacation destinations")
	WebElement featured;
	
	public void vacationdest() {
		featured.click();
	}
	
	@FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[3]/form/table/tbody/tr[10]/td/table/tbody/tr/td[2]/font/a")
	WebElement here;
	
	public void reghere() {
		here.click();
	}
	
	@FindBy(partialLinkText="About.com")
	
	WebElement about;
	
	public void about() {
		about.click();
	}                                
	
	@FindBy(partialLinkText="Salon Travel")
	
	WebElement travel;
	
	public void Salon(){
		travel.click();
	}                                        
	
	
	@FindBy(name = "userName")
	WebElement username;
	
	@FindBy(name = "password")
	WebElement password;
	
	@FindBy(name = "login")
	WebElement signin;
	
	public void Signin(String uname,String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		signin.click();
	}

}
