package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestMap {
	public static void main(String[] args) {
    List<Integer> list=new ArrayList<>();
	list.add(8);
	list.add(12);
	list.add(9);
	list.add(11);
	list.add(3);
	list.add(7);
	list.add(1);
	 List<Integer> list2=list.stream().map(e->e*e).collect(Collectors.toList());
	 System.out.println(list2);
	}
}
