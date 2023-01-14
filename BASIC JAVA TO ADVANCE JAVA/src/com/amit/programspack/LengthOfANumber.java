package com.amit.programspack;

import java.util.Scanner;

public class LengthOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int count=0;
		while(num>0)
		{
			count+=1;
			num/=10;
		}
	
	System.out.println("The lenght of a number is : "+count);
	
	}

}
