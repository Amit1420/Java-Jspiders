package com.amit.assignment;

import java.util.Scanner;

public class NivenAndHarshad {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=sc.nextInt();
		int temp=num;
		int sum=0;
		while(num>0) 
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		if(temp%sum==0)
		{
			System.out.println("Number is NIVEN/HARSHAD");
		}
		else
		{
			System.out.println("Number is not NIVEN/HARSHAD");
		}
	}

}
