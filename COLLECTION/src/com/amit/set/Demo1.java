package com.amit.set;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {
	public static void main(String[] args) {
		Set s=new HashSet();
		s.add("java");
		s.add("java");
		s.add("c");
		System.out.println("Size : "+s.size());
		
		for(Object o:s)
		{
			System.out.println(o);
		}
	}

}
