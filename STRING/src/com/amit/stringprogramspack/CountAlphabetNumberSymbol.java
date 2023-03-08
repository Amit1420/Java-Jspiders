package com.amit.stringprogramspack;

import java.util.Scanner;

public class CountAlphabetNumberSymbol {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.next();
		int alphabet=0,symbol=0,number=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{
				alphabet++;
			}
			else if(ch>='0'&&ch<='9')
			{
				number++;
			}
			else
			{
				symbol++;
			}
		}
		System.out.println("Alphabet : "+alphabet);
		System.out.println("Number : "+number);
		System.out.println("Symbol : "+symbol);
		

	}

}
