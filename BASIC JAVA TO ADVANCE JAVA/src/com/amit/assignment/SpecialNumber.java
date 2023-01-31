package com.amit.assignment;

import java.util.Scanner;

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num=sc.nextInt();
		int actualNum=num;
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		int temp=sum;
		int rev=0;
		while(sum>0)
		{
			int rem=sum%10;
			rev=rev*10+rem;
			sum/=10;
		}
		int res=temp*rev;
		System.out.println("Sum : "+temp);
		System.out.println("Reverse Number : "+rev);
		System.out.println("Multiplication of "+temp+" And "+rev+": "+res);
		if(actualNum==res)System.out.println("Special Number");
		else System.out.println("Not Specail Number");
		

	}

}
