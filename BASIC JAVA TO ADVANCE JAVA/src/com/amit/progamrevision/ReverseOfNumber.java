package com.amit.progamrevision;

import java.util.Scanner;

public class ReverseOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int rev=0;
		if(num<0)System.out.println("No Negatives");
		else
		{
			while(num>0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				num=num/10;
			}
		}
		System.out.println("Reverse Of Number is "+rev);
	}

}
