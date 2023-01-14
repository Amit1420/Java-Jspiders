package com.amit.methodpack;

import java.util.Scanner;

public class MethodTestingClass2 {
	public static void factorial(int num)
	{
		
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println(num+" != "+fact);
	}

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Please Enter A Number :");
		int num=s.nextInt();
		factorial(num);
		System.out.println("Thank You !!!");
		

	}

}