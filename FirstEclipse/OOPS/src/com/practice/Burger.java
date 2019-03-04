package com.practice;

import java.util.Scanner;

 class Hamburger{
	
	private String name;
	private String rolltype;
	private String meat;
	
	private double price = 0;
	
	public Hamburger(String name, String rolltype, String meat) {
		super();
		this.name = name;
		this.rolltype = rolltype;
		this.meat = meat;
	}
	
  public double addition(String add)
  {
	 double addprice = 0;
	switch(add)
	{
	case "lettuce":
		System.out.println(add +"has been added"); 
	    return addprice+=0.25;
	case "carrot":
		System.out.println(add +"has been added"); 
	    return addprice+=0.35;    
	case "tomato":
		System.out.println(add +"has been added"); 
	    return addprice+=0.65;  
	case "mionese":
		System.out.println(add +"has been added");
		return addprice+=0.75;  	
	}
	return (Double) null;
  }
	  

public double baseprice() {
	this.price = 20;
	System.out.println("My hamburger price is"+this.price);
	return this.price;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getRolltype() {
	return rolltype;
}

public void setRolltype(String rolltype) {
	this.rolltype = rolltype;
}

public String getMeat() {
	return meat;
}

public void setMeat(String meat) {
	this.meat = meat;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}
	


}

class Healthyburger extends Hamburger{
	
	private double Healthyprice;

	public Healthyburger(String name, String meat) {
		super(name, "brwon rye bread roll", meat);
		// TODO Auto-generated constructor stub
	}
	
	public double addtwo(String add)
	  {
		 double addprice = 0;
		switch(add)
		{
		case "egg":
			System.out.println(add +"has been added"); 
		    return addprice+=0.25;
		case "beef":
			System.out.println(add +"has been added"); 
		    return addprice+=1.35; 
		}
		return (Double) null;
	  }
	
	public double totalprice() {
		this.Healthyprice= baseprice();
		
		
	}
	
}














public class Burger {

	public static void main(String[] args) {
	
		

	
		
		
	}

}
