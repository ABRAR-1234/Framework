package com.OhrmtestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.OHRMlib.Genral;

public class TC_02 {

	
	@Test
	public void LoginaddEmployee() throws IOException, InterruptedException {
		
		Genral r = new Genral();
		
		r.Setup();
		r.Login();
		r.verifylogin();
		r.AddEmployee();
		r.getEmpcodeSave();
		r.VerifyAddEmployee();
		r.Tearsdown();

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
