package com.New;

public class multidimenson {

	public static void main(String[] args)
	{
		int arr[][] = new int[2][2];
		arr[0][0]=1;
		arr[0][1]=2;
		arr[1][0]=1;
		arr[1][1]=2;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");			
			}
			System.out.println();
		}
		
	}
}
