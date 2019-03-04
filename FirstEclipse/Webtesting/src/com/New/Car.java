package com.New;

public class Car {

	private int doors;
	private int wheels;
	private String engine;
	private String model;
	
	public void setModel(String model)
	{
	String Validmodel = model.toLowerCase();
	if( Validmodel.equals("carrera") || Validmodel.equals("holden"))
	{
		this.model = model;
	}
	else {
		this.model = "Unknown";
	}
	}
	
	public String getModel()
	{
		return this.model;
	}
}
