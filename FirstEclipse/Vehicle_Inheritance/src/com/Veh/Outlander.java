package com.Veh;

public class Outlander extends Car{
     
	private int ServiceMonths;
	
	public Outlander(String name, int size, int doors, int gears, int wheels, boolean isManual,int ServiceMonths) {
		super("Outlander", 5, 5, 6, 5, false);
		this.ServiceMonths = ServiceMonths;
	
	}

	public void accelerate(int rate)
	{
		int newvelocity = getCurrentvelocity() + rate;
		if(newvelocity < 0) {
			stop();
			changegear(1);
		    }
			else if(newvelocity > 0 && newvelocity < 10){
				changegear(1);
			}
			else if(newvelocity >10 && newvelocity < 10)
			{
				changegear(3);
		    }
			else
			{
				changegear(4);
			}	
		
		if(newvelocity > 0) {
			changevelocity(newvelocity, getCurrentdirection());
		}
	}
	

	
	
	
}
