package com.amit.anonymousclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
				list.add(new Student(1,"Amit","amitkumar80999@gmail.com"));
				list.add(new Student(2,"Sumit","sumitkumar999@gmail.com"));
				list.add(new Student(3,"Anmol","anmolkumar123@gmail.com"));
				list.add(new Student(4,"Ajeet","ajeetkumar189@gmail.com"));
//		Helper helper=new Helper();
		Comparator<Student> com =new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getName().compareToIgnoreCase(o2.getName());
			}
		};
		Collections.sort(list,com);
		
		for(Student n :list) System.out.println(n);
		
//		System.out.println(helper.count);

	}

}
