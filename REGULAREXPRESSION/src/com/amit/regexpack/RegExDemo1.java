package com.amit.regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo1 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("a");
		Matcher m=p.matcher("java");
		while(m.find())
		{
			System.out.println(m.start()+","+m.end()+","+m.group());
		}

	}

}
