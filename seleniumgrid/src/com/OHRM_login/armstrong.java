package com.OHRM_login;

public class armstrong {
	
	int number = 370, num, temp;
	int res = 0;
	
	num = number;
	
	while(num!=0)
	{
		temp = num%2;
		res = res + temp*temp*temp;
		num /=10;	
	}
	if(res == num)
	{
		System.out.println("the number is armstrong number:"+number);
		
	}
	else {
		System.out.println("the number is not  armstrong number:"+number);
		
	}
	
}
	
	
	
	
	

}
