package com.amit.stringprogramspack;

public class CountOccurance {

	public static void main(String[] args) {
		String s="awesome";
		String s1=s.replace("e","");
		int count=s.length()-s1.length();
		System.out.println("Count : "+count);

	}

}
