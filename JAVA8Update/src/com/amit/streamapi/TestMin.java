package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TestMin {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
		list.add(8);
		list.add(12);
		list.add(9);
		list.add(11);
		list.add(3);
		list.add(7);
		list.add(1);
		list.add(13);
		list.add(2);
		list.add(16);
		list.add(4);
		list.add(5);
		
		Optional<Integer> optional = list.stream().min((e1,e2)->e1-e2);
		System.out.println(optional.isPresent());
		System.out.println(optional.get());

	}

}
