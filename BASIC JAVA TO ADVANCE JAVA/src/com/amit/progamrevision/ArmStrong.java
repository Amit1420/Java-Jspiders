package com.amit.progamrevision;

import java.util.Scanner;

public class ArmStrong 
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int temp=num;
		int res=0;
		if(num<0)System.out.println("No Negatives");
		else
		{
			while(num>0)
			{
				int rem=num%10;
				res=(int) (res+Math.pow(rem, 3));
				num=num/10;
			}
		}
		
		if(temp==res)System.out.println("ArmStrong");
		else System.out.println("Not ArmStrong");
		
	}

}
