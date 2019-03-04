package com.New;

public class Animall {

	private int brain;
	private int body;
	private int size;
	private int weight;
	private String name;
	public Animall(int brain, int body, int size, int weight, String name) {
		super();
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.name = name;
	}
	
	public void move(int speed)
	{
		System.out.println("Aimal.move called moving with:" + speed);
	}
	
	public void eat() {
		System.out.println("Animal.eat() was called");
		
	}

	public int getBrain() {
		return brain;
	}

	public int getBody() {
		return body;
	}

	public int getSize() {
		return size;
	}

	public int getWeight() {
		return weight;
	}


	public String getName() {
		return name;
	}

	
	
	
	
}
