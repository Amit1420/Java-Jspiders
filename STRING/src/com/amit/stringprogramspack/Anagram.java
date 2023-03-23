package com.amit.stringprogramspack;

import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two String");
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(isAnagram(s1, s2));
		
	

	}
	static boolean isAnagram(String s1,String s2)
	{
	while(true)
	{
		if(s1.length()==s2.length()) return true;
		if(s1.length()!=s2.length()) return false;
		char ch=s1.charAt(0);
		s1=s1.replace(ch+"","");
		s2=s2.replace(ch+"","");
		
	}
	}

}
