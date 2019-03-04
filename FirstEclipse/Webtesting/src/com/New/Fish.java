package com.New;

public class Fish extends Animall {
	
	private int gills;
    private int fins;
    private int eyes;
    private int tail;

    public Fish(int size, int weight, String name,int gills,int fins, int tail,int eyes) {
		super(1, 1, size, weight, name);
		this.gills = gills;
		this.tail = tail;
		this.fins = fins;
		this.eyes = eyes;
	}

 private void rest() {
	 
 }
 
 private void backfin() {
	 
 }
  
 public void swim(int speed)
 {
	 super.move(speed);
	 
 }
    
    
   

}
