package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.amit.lambda.Customer;

public class TestMap3 {

	public static void main(String[] args) {
		List<Customer> l = new ArrayList<>();
		l.add(new Customer(1, "Amit", "Potato", "Vegetables"));
		l.add(new Customer(2, "Aman", "Tomato", "Vegetables"));
		l.add(new Customer(3, "Arun", "Orange", "Fruits"));
		l.add(new Customer(4, "Anmol", "Cashew", "Dry Fruits"));
		l.add(new Customer(5, "Sumit", "Raisins", "Dry Fruits"));
		l.add(new Customer(6, "Rahul", "Wheel", "Washing Powder"));
		l.add(new Customer(7, "Ajeet", "Tide", "Washing Powder"));
		l.add(new Customer(8, "Sonu", "Kit Kat", "Chocolates"));
		l.add(new Customer(9, "Monu", "Surf Excel", "Washing Powder"));
		l.add(new Customer(10, "Tinku", "Green Chilli", "Vegetables"));
		l.add(new Customer(11, "Jatin", "Diary Milk", "Chocolates"));
		l.add(new Customer(12, "Harshad", "Onion", "Vegetables"));
		l.add(new Customer(13, "Darshit", "Apple", "Fruits"));
		
//		Function<Customer, Customer> fun = new Function<Customer, Customer>() {
//
//			@Override
//			public Customer apply(Customer t) {
//				String e= t.getName().toUpperCase();
//				t.setName(e);
//				
//				return t;
//			}
//
//		};
//		List<Customer> list2=l.stream().map(fun).collect(Collectors.toList());
//		for(Customer t :list2)System.out.println();
        List<Customer> list2=l.stream().
        		map(e->{
        			e.setName(e.getName().toUpperCase());
        			return e;
        		})
        		.collect(Collectors.toList());
        list2.forEach(e->System.out.println(e));
//        System.out.println(l);
	}
	

}
