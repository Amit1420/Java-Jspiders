package com.amit.programspack;

import java.util.Scanner;

public class SumOfDigitOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int rem=0;
		int sum=0;
		while(num>0)
		{
			rem=num%10;
			sum+=rem;
			num/=10;
		}
		System.out.println("The sum of the digit of a number is : "+sum);
	}

}
