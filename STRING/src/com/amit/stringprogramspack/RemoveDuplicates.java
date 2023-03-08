package com.amit.stringprogramspack;

import java.util.Scanner;

public class RemoveDuplicates {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.next();
		String temp="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(!temp.contains(ch+""))
			{
				temp=temp+ch;
			}
		}
		System.out.println(temp);

	}

}
