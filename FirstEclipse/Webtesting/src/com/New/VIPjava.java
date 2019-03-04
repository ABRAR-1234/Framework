package com.New;

public class VIPjava {

	private String name;
	private double creditLimit;
	private String email;

	public VIPjava() {
		this("syed",20000.00,"sye.abr");
	}
		
	public VIPjava(String name, double creditLimit, String email) {
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public VIPjava(String name, double creditLimit) {
		this(name , creditLimit, "sye.abr");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	
	
	
	
	
	
	
	
}
