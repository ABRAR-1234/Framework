package com.Veh;


public class Doors {
	
	private String type;
    private String quality;
    private Dimension dimensions;
    
    
	public Doors(String type, String quality, Dimension dimensions) {
		super();
		this.type = type;
		this.quality = quality;
		this.dimensions = dimensions;
	}
	
	
	public void open() {
		System.out.println("the doors opened");
	}

	public void close() {
		System.out.println("the doors closed");
	}
	
	

	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getQuality() {
		return quality;
	}


	public void setQuality(String quality) {
		this.quality = quality;
	}


	public Dimension getDimensions() {
		return dimensions;
	}


	public void setDimensions(Dimension dimensions) {
		this.dimensions = dimensions;
	}

    
    
    
    
}
