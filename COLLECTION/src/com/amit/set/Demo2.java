package com.amit.set;

import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		Set s=new TreeSet();
		s.add("java");
		s.add("python");
		s.add("c");
		s.add("html");
		s.add("sql");
		
		for(Object o:s)
		{
			System.out.println(o);
		}

	}

}
