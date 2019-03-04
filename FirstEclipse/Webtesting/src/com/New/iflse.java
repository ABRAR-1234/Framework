package com.New;

import javax.print.DocFlavor.STRING;

public class iflse {
 
	public static void main(String[] args)
	{
		int a = 10;
		int b = 10;
		int c = 10;
		if(a>b & a>c)
			{
			System.out.println("a is greater");
			}
		else if(b>a & b>c){
			System.out.println("b is greater");
		}
		else{
			System.out.println("c is greater");
		}
		
		System.out.println("********");
		
		
		String d = "Hello";
		String e = "hello";
		
		if(d.equalsIgnoreCase(e))
		{
			System.out.println("e is equals to d" );
		}
		else {
			System.out.println("e is not equals to d" );	
		}
		
		
		
		System.out.println("********");
		
		
		String f = "Hello";
		String g = "ello";
		
		if(f.contains(g))
		{
			System.out.println("e is in d" );
		}
		else {
			System.out.println("e is not equals to d" );	
		}
		
		System.out.println("********");
		
		String l = "Hello";
		String m = "ello";
		
		if(l.contains(m))
		{
			
		if(l.length()>m.length())
				{
			System.out.println("l has more number of characters" );	
				}
		}

		else {
			System.out.println("e is not equals to d" );	
		}
		
		
		String h = "every";
		for(int i = 0;i<h.length();i++)
		{
			char z = h.charAt(i);
			System.out.println(z);
		}
		
		
		
		
		
		
		
		
		
	}
}
