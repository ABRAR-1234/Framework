package com.Veh;

public class Printer {

	private int tonerLevel;
	private int Number_of_pages;
	public Printer(int tonerLevel, int number_of_pages) {
		super();
		this.tonerLevel = tonerLevel;
		this.Number_of_pages = number_of_pages;
	}
	
	public void tonerlevel(int value)
	{
		if(tonerLevel <= 0  || tonerLevel > 100)
		{
			int level = this.tonerLevel + value;
			if(level > 100)
			{
				this.tonerLevel = 100;
			}
			else {
				this.tonerLevel = level;
			}
		}
	}
	
	
	public void pagesprinted(int papers)
	{
		int pap = papers*2;
		if(this.tonerLevel>0)
		{
		System.out.println("total nof pages printed:"+ Integer.sum(pap, Number_of_pages));	
	}
		else {
			System.out.println("Print cannot be taken");
		}
		
	
	}
}
