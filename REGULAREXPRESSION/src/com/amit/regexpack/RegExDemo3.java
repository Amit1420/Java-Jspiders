package com.amit.regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo3 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[0-9]");
		Matcher m=p.matcher("1420ja56va134");
		while(m.find())
		{
			System.out.println(m.start()+","+m.end()+","+m.group());
		}

	}

}
