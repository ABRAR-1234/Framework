package com.New;


import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {

	public static void main(String[] args)
	{
		List<Object> a = new ArrayList<>();
		
		a.add("Syed");
		a.add("123");
		a.add(12);
		
		for(int j=0;j<a.size();j++)
		{
			System.out.println(a.get(j));
			
		}
		
		
	}
	
	
}
