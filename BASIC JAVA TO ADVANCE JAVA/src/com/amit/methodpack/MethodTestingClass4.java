package com.amit.methodpack;

import java.util.Scanner;

public class MethodTestingClass4 {
	public static int factorial(int num)
	{
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		return fact;
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter A Number :");
		int num=s.nextInt();
		if(num<0)
		{
			System.out.println("No Negative Values !!!");
		}
		else
		{
			System.out.println(num +" != "+ factorial(num));
		}
		
		System.out.println("Thank You !!!");
		

	}

}