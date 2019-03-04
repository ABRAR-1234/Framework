package com.Veh;

public class Carr {

	private boolean engine;
	private int cylinders;
	private int wheels;
	
	
	public Carr(boolean engine, int cylinders, int wheels) {
		super();
		this.engine = engine;
		this.cylinders = cylinders;
		this.wheels = wheels;
	}

	public boolean startEngine(boolean start)
	{
		return start;
	}
	
	public String brake() {
		return "No brake has been applied";
	}
	
	public String accelerate() {
		return "Accelarate to move";	
	}
	
}



public class Volkswagen extends Carr{
	
	public Volkswagen()
	{
		super(true,4,4);
	}

	@Override
	public boolean startEngine(boolean start) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Volkswagen applied brake";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Volkswagen is accelerated";
	}
	
	

}

public class Skoda extends Carr{
	
	public Skoda()
	{
		super(true,4,4);
	}

	@Override
	public boolean startEngine(boolean start) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "Skda applied brake";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "Skda is accelerated";
	}
	
	

}

public class Mai{
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
	}
}


