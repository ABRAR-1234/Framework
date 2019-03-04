package com.Veh;

public class Bed {

	private String type;
	private String Accomodate;
	private Dimension dimension;
	public Bed(String type, String accomodate, Dimension dimension) {
		super();
		this.type = type;
		Accomodate = accomodate;
		this.dimension = dimension;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAccomodate() {
		return Accomodate;
	}
	public void setAccomodate(String accomodate) {
		Accomodate = accomodate;
	}
	public Dimension getDimension() {
		return dimension;
	}
	public void setDimension(Dimension dimension) {
		this.dimension = dimension;
	}
	
	
	
	
	
	
	
	
}
