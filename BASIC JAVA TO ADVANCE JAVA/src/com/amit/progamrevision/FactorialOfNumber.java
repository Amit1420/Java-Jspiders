package com.amit.progamrevision;

import java.util.Scanner;

public class FactorialOfNumber 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int fact=1;
		if(num<0)System.out.println("No Negatives");
		else
		{
			for(int i=1;i<=num;i++)fact=fact*i;
		}
		System.out.println(num+" != "+fact);
	}

}
