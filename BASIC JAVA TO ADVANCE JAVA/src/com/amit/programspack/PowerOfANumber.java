package com.amit.programspack;

import java.util.Scanner;

public class PowerOfANumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Base :");
		int base=s.nextInt();
		System.out.println("Enter The Expo :");
		int expo=s.nextInt();
		int res=1;
		while(expo>0)
		{
			res=res*base;
			expo--;
		}
		System.out.println("The Result is : "+res);
		
	}

}
