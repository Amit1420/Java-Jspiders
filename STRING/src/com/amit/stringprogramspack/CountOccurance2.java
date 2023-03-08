package com.amit.stringprogramspack;

public class CountOccurance2 {

	public static void main(String[] args) {
		String s="happybirthday";
		while(s.length()>0)
		{
			char ch=s.charAt(0);
			String s1=s.replace(ch+"", "");
			int count=s.length()-s1.length();
			System.out.println(ch+" : "+count);
			s=s1;
		}

	}

}
