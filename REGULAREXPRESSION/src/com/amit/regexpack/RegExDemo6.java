package com.amit.regexpack;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExDemo6 {

	public static void main(String[] args) {
//		Pattern p=Pattern.compile("ab+");
		Pattern p=Pattern.compile("ab{2}c");
		Matcher m=p.matcher("abbcacbcabbcabbabaabdaabbabccbc");
		while(m.find())
		{
			System.out.println(m.start()+","+m.end()+","+m.group());
		}

	}

}
