package com.Testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation1 {
	
	
	@BeforeTest
	public void applicationlaunnch() {
		
		System.out.println("Gmail application laUnched");
		
	}
	
	@Test(priority = 0)
	public void inbox() {
		
		System.out.println("Gmail inbox application laUnched");
		
	}
	
	@Test(priority = 1)
	public void composemail() {
		
		System.out.println("Gmail composemail application laUnched");
		
	}
	
	@AfterTest
	public void applicationclose() {
		
		System.out.println("Gmail  application close laUnched");
		
	}
	

}
