package com.New;

import java.util.Scanner;

public class switchcase {

	public static void main(String[] args)
	{
		char operator;
		double num1;
		double num2;
		 double result;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter operator( + , - , * , /): ");
		operator = scanner.next().charAt(0);
		System.out.print("Enter num1 and num2 respectively: ");
		num1 = scanner.nextDouble();
		num2 = scanner.nextDouble();
		
		switch(operator)
		{
		
		case '+':
			result = num1 + num2;
			   System.out.print(num1 +"+"+  num2 + "=" + result );
			break;
		case '-':
			result = num1 - num2;
			   System.out.print(num1 +"-"+  num2 + "=" + result );
			break;
			
		case '*':
			result = num1 * num2;
			   System.out.print(num1 +"*"+  num2 + "=" + result );
			break;
			
		case '/':
			result = num1 / num2;
		   System.out.print(num1 +"/"+  num2 + "=" + result );
			break;	
			
		default:
			System.out.println("no op");
	

		
		
		}
		
		
		
		
		
		
		
	}
	
}
