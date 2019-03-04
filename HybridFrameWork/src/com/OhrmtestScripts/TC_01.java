package com.OhrmtestScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.OHRMlib.Genral;

public class TC_01 {

	@Test
	public void tc_01() throws IOException{
		
		Genral g = new Genral();
		
		g.Setup();
		g.Login();
		g.verifylogin();
		g.Tearsdown();

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
