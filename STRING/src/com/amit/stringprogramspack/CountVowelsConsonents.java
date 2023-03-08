package com.amit.stringprogramspack;

import java.util.Scanner;

public class CountVowelsConsonents {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A String");
		String s=sc.next();
		String vowels="aeiouAEIOU";
		int vowel=0,consonents=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(vowels.contains(ch+""))
			{
				vowel++;
			}
			else
			{
				consonents++;
			}
		}
		System.out.println("Vowels : "+vowel);
		System.out.println("Consonents : "+consonents);

	}

}
