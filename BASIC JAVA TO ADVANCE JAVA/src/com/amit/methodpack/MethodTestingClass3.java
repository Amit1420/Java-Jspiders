package com.amit.methodpack;

import java.util.Scanner;

public class MethodTestingClass3 {
	public static int factorial()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter A Number :");
		int num=s.nextInt();
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.print(num+" != ");
		return fact;
	}

	public static void main(String[] args) 
	{
		
		System.out.println(factorial());
		System.out.println("Thank You !!!");
		

	}

}