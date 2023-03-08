package com.amit.stringprogramspack;

public class CorrectCase {

	public static void main(String[] args) {
		String s="jaVa is easy";
		String temp="";
		String[] str=s.split("");
		for(int i=0;i<str.length;i++)
		{
			temp+=str[i].substring(0,1).toUpperCase()+str[i].substring(1).toLowerCase()+"";
			temp+="";
		}
		 temp=temp.trim();
		System.out.println(temp);
	}

}
