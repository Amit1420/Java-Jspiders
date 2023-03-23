package com.amit.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Demo {

	public static void main(String[] args) {
		SortedSet s=new TreeSet();
		s.add(40);
		s.add(50);
		s.add(10);
		s.add(60);
		s.add(30);
		s.add(20);
		SortedSet s1=s.headSet(40);
		System.out.println(s1);
		SortedSet s2=s.tailSet(40);
		System.out.println(s2);
		SortedSet s3=s.subSet(20,50);
		System.out.println(s3);

	}

}
