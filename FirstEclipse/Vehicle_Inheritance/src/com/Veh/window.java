package com.Veh;

public class window {
	
	
	private String type;
	private String material;
	private Dimension dimension;
	
	
	public window(String type, String material, Dimension dimension) {
		super();
		this.type = type;
		this.material = material;
		this.dimension = dimension;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getMaterial() {
		return material;
	}


	public void setMaterial(String material) {
		this.material = material;
	}


	public Dimension getDimension() {
		return dimension;
	}


	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	
	

}
