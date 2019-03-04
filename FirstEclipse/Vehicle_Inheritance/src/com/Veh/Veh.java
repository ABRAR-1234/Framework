package com.Veh;

public class Veh {
	
	private String name;
	private int size;
	
	private int currentvelocity;
	private int currentdirection;
	
	
	public Veh(String name, int size) {
		super();
		this.name = name;
		this.size = size;
		
		this.currentdirection = 0;
		this.setCurrentvelocity(0);
	}
	
	public int getCurrentdirection() {
		return currentdirection;
	}

	public void setCurrentdirection(int currentdirection) {
		this.currentdirection = currentdirection;
	}

	public void steer(int direction)
	{
		this.currentdirection += direction;
		System.out.println("Vehical.steer() moving in direction: degrees" + this.currentdirection );
	}
	
	public void move(int velocity,int direction)
	{
		this.setCurrentvelocity(velocity);
		this.currentdirection = direction;
		System.out.println("vehicle moving in velocity" + velocity + "degrees" + direction);
		
	}
		
	
	public void stop() {
		this.setCurrentvelocity(0);
		System.out.println("Vehicle has stopped");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getCurrentvelocity() {
		return currentvelocity;
	}

	public void setCurrentvelocity(int currentvelocity) {
		this.currentvelocity = currentvelocity;
	}
	
	
		
	}
	
	

