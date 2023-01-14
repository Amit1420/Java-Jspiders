package com.amit.progamrevision;

import java.util.Scanner;

public class LengthOfNumber 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int count=0;
		if(num<0)System.out.println("No Negatives");
		else
		{
			while(num>0)
			{
				count++;
				num/=10;
			}
		}
		System.out.println("The length of number is "+count);

	}

}
