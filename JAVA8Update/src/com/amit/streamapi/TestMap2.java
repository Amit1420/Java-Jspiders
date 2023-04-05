package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestMap2 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(8);
		list.add(12);
		list.add(9);
		list.add(11);
		list.add(3);
		list.add(7);
		list.add(1);

		Function<Integer, String> fun = new Function<Integer, String>() {

			@Override
			public String apply(Integer t) {

				return t * t + " ";
			}

		};
		List<String> list2=list.stream().map(fun).collect(Collectors.toList());
		 System.out.println(list2);

	}

}
