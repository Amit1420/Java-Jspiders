package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.amit.lambda.Customer;

public class TestFilter3 {

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

		List<Customer> l2=l.stream().filter(e->e.getName().startsWith("S"))
	             .collect(Collectors.toList());
		l2.forEach(e->System.out.println(e));
		
	}

}
