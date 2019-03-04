package com.New;

public class Dog extends Animal{

	private int legs;
	private int eyes;
	private int tail;
	private int teeth;
	private String coat;
	public Dog(String name, int size, int weight,int legs,int eyes,int tail,int teeth,String coat) {
		super(1, 1, name, size, weight);
		this.legs = legs;
		this.eyes = eyes;
		this.coat = coat;
		this.teeth = teeth;
		this.tail = tail;
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}
	
	
public void chew() {
	eat();
	move();
	
}

	

}
