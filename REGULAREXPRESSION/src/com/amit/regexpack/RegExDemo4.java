package com.amit.regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo4 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[1,2,4,8,9]{6}");
		Matcher m=p.matcher("amitraaz9973568704bokarojharkhand829144");
		while(m.find())
		{
			System.out.println(m.start()+","+m.end()+","+m.group());
		}

	}

}
