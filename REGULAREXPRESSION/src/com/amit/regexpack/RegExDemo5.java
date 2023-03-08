package com.amit.regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo5 {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("[6-9][0-9]{9}");
		Matcher m=p.matcher("amitraaz9973568704bokarojharkhand829144");
		while(m.find())
		{
			System.out.println(m.start()+","+m.end()+","+m.group());
		}

	}

}
