package com.amit.programspack;

import java.util.Scanner;

public class SumOfDigitOfANumber {
	public static int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		return rev;
	}
	public static int length(int rev)
	{
		int count=0;
		while(rev>0)
		{
			count++;
			rev/=10;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int revNum=reverse(num);
		System.out.println("Enter A Key :");
		int key=s.nextInt();
		while(revNum>0)
		{
		if(length(revNum)!=key)
		{
			revNum/=10;
			continue;
		}
		else 
		{
			int sum=0;
			while(revNum>0)
			{
				int rem=revNum%10;
				sum+=rem;
				revNum/=10;
			}
			System.out.println("Sum : "+sum);
		}
		}
		
		
	}

}
