package com.practice;

import java.util.Scanner;

public class arry {

	
	//incomplete
	
	
	
	
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {

		int ar[] = getintegers(5);
		
		System.out.println(sortarray(ar));
	
		
		}
	
	public static int[] getintegers(int numbers)
	{
		int values[] = new int[numbers];
		System.out.println("Enter the number:/r");

		for(int i =0;i<values.length;i++)
		{
			values[i] = scanner.nextInt();
		}
		return values;
	}
	
	
	public static int[] sortarray(int[] array)
	{
	int sort[] = new int[array.length];
	for(int i=0;i<array.length;i++)
	{
		sort[i] = array[i];
	}
	boolean flag = true;
	int temp;
	while(flag)
	{
		flag = false;
		for(int i=0;i<sort.length-1;i++)
		{
			if(sort[i] < sort[i+1])
			{
				temp = sort[i];
				sort[i] = sort[i+1];
				sort[i+1] = temp;
				flag = true;
			}
		}
	}
	return sort;
	}
	
	public static void printarr(int[] arr)
	{
		int a[] = new int[arr.length];
		for(int i=0;i<a.length;i++)
		{
			System.out.println("The array is:"+a[i]);
		}
	}
	
	
}
