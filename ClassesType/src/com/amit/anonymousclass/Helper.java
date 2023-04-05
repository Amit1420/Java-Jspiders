package com.amit.anonymousclass;

import java.util.Comparator;

public class Helper implements Comparator<Student>{
    static int count;
	public int compare(Student o1, Student o2) {
		count++;
		return o1.getName().compareToIgnoreCase(o2.getName());
	}

}
