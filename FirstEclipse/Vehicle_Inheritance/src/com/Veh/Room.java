package com.Veh;

public class Room {

	private Doors door;
	private window thewindow;
	private Bed bed;
	public Room(Doors door, window thewindow, Bed bed) {
		super();
		this.door = door;
		this.thewindow = thewindow;
		this.bed = bed;
	}
	public Doors getDoor() {
		return door;
	}
	public void setDoor(Doors door) {
		this.door = door;
	}
	public window getThewindow() {
		return thewindow;
	}
	public void setThewindow(window thewindow) {
		this.thewindow = thewindow;
	}
	public Bed getBed() {
		return bed;
	}
	public void setBed(Bed bed) {
		this.bed = bed;
	}
	
	
	
	
	
}
