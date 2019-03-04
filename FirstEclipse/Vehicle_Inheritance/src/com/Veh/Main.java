package com.Veh;

public class Main extends Outlander {

	
	
	
	public Main(String name, int size, int doors, int gears, int wheels, boolean isManual, int ServiceMonths) {
		super(name, size, doors, gears, wheels, isManual, ServiceMonths);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Outlander outlander = new Outlander("Outlander", 5, 5, 6, 5, false, 36);
       outlander.steer(20);
		outlander.accelerate(30);
	}

}
