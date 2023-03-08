package com.amit.stringprogramspack;

import java.util.Scanner;

public class ReverseEachWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.nextLine();
		String[] a=s.split(" ");
		String res="";
		for(String s1:a)
		{
			res=res+rev(s1);
			res+=" ";
		}
		res=res.trim();
		System.out.println(res);
		
	}

	static String rev(String s1) {
		String str="";
		for(int i=s1.length()-1;i>=0;i--)
		{
			str=str+s1.charAt(i);
		}
		return str;
	}

}
