package com.amit.assignment;

import java.util.Scanner;

public class ReverseOfNumber {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt(); 
		int res=num;
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=(rev*10)+rem;
			num=num/10;
		}
		
			System.out.println("Reverse Of Number is :"+rev);

	}

}
