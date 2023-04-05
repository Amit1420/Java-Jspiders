package com.amit.map;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map m=new HashMap();
		System.out.println(m.put("a", 10));
		System.out.println(m.put("a", 20));
		
		System.out.println("Size = "+m.size());
		
		System.out.println(m.get("a"));
		

	}

}
