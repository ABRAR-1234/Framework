package com.Veh;

public class Room_compositon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Dimension dim = new Dimension(4, 5);
		
		window wind = new window("Sliding", "Glass", dim);
		
		Doors dr = new Doors("Sliding", "Glass", dim);
		
		Bed bed = new Bed("wood", "two", dim);
		
		Room room = new Room(dr, wind, bed);
		
		room.getDoor().open() ;
	}

}
