package com.amit.progamrevision;

import java.util.Scanner;

public class NivenNumber 
{
  public static void main(String[] args) 
  {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter A Number");
	int num=s.nextInt();
	int temp=num;
	int sum=0;
	if(num<0)System.out.println("No Negatives");
	else
	{
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
	}
	if(temp%sum==0)System.out.println("Niven Number");
	else System.out.println("Not Niven Number");
  }
}
