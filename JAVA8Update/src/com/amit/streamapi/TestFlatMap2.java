package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFlatMap2 {

	public static void main(String[] args) {
		List<Integer> list = List.of(1,2,3,4,5,6);
//		List<Integer> list2 = list.stream().map(e->e*e).collect(Collectors.toList());
//		List<Integer> list3 = list.stream().map(e->e*2).collect(Collectors.toList());
//		System.out.println(list2);
//		System.out.println(list3);
//		List<Integer> list4 = new ArrayList<>();
//		for(int i=0;i<list2.size();i++)
//		{
//			list4.add(list2.get(i));
//			list4.add(list3.get(i));
//		}
//		System.out.println(list4);
		
		List<Integer> mlist = list.stream().flatMap(e->Stream.of((e*e),(e*2),(e*3))).collect(Collectors.toList());
		System.out.println(mlist);
	}

}
