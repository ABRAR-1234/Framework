package com.New;

public class Meth extends Dog{

	public Meth(String name, int size, int weight, int legs, int eyes, int tail, int teeth, String coat) {
		super(name, size, weight, legs, eyes, tail, teeth, coat);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

			Animal n = new Animal(1, 1, "Animal", 5, 5);
			
			Dog d = new Dog("lab",5,5,4,2,1,10,"fur");
			
			d.eat();
			d.chew();
			d.move();

	}

}
