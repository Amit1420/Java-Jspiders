package com.amit.list;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo2 {

	public static void main(String[] args) {
		List a=new LinkedList();
		a.add(100);
		a.add(200);
		a.add(300);
		a.add(400);
		a.add(500);
		System.out.println("Remove element :"+a.remove(1));
		System.out.println();
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println();
		Object o=new Integer(100);
		System.out.println(a.indexOf(o));
		
		
		System.out.println();
		a.set(3, new Integer(600));
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println();
		a.add(4, new Integer(700));
		for(int i=0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println();
		System.out.println(a.lastIndexOf(new Integer(700)));
		
		//a.indexOf(new Integer(700),0);
		
		Collections.sort(a);
		System.out.println(a);

	}

}
