package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface TestFilter2 {
	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(20);
        list.add(30);
        list.add(38);
        list.add(32);
        list.add(36);
        list.add(14);
        list.add(16);
        List<Integer> list1=list.stream().filter(e->e%2==0)
             .collect(Collectors.toList());
           System.out.println(list1);
	}
}
