package com.amit.assignment;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int n=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+factorial(rem);
			num=num/10;
		}
		if(sum==n)
		{
			System.out.println("Number is StrongNumber");
		}
		else
		{
		System.out.println("Number is not StrongNumber");
		}
		
	}
	public static int factorial(int res)
	{
		int fact=1;
		for(int i=1;i<=res;i++)
		{
			fact=fact*i;
		}
		return fact;
		
	}

}
