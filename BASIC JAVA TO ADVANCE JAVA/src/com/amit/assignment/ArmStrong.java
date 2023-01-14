package com.amit.assignment;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int n=num;
		int sum=0;
		while(num>0) 
		{
			int r=num%10;
			sum=(int) (sum+Math.pow(r,3));
			num=num/10;
		}
		if(sum==n)
		{
			System.out.println("Number is ArmStrong");
		}
		else
		{
			System.out.println("Number is not ArmStrong");
		}

	}

}
