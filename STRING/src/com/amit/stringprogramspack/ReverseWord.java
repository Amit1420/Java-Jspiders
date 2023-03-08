package com.amit.stringprogramspack;

import java.util.Scanner;

public class ReverseWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.nextLine();
		String[] s1=s.split(" ");
		String temp=" ";
		for(int i=s1.length-1;i>=0;i--)
		{
			temp=temp+s1[i]+" ";		
		}
		System.out.println(temp.trim());
	}

}
