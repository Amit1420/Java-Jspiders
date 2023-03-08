package com.amit.stringprogramspack;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				int num=ch-48;
				sum=sum+num;
			}
		}
       System.out.println("Sum : "+sum);
	}

}
