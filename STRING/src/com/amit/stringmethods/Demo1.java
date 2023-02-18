package com.amit.stringmethods;

public class Demo1 
{

	public static void main(String[] args) 
	{
		String s="javadeveloper";
		System.out.println(s.length());
		System.out.println(s.charAt(0));
		System.out.println(s.contains("dev"));
		System.out.println(s.startsWith("java"));
		System.out.println(s.endsWith("per"));
		System.out.println(s.equals("JavaDeveloper"));
		System.out.println(s.equalsIgnoreCase("JAvaDevLopeR"));

	}

}
