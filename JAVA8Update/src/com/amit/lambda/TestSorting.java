package com.amit.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestSorting {

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
		Comparator<Customer> customer = new Comparator<Customer>() {

			@Override
			public int compare(Customer c1, Customer c2) {
				if (c1.getType().equals(c2.getType()))
					return c1.getProduct().compareToIgnoreCase(c2.getProduct());
				else
					return c1.getType().compareToIgnoreCase(c2.getType());

			}
		};
		Collections.sort(l, customer);
        System.out.println("----------------------sorted by type along with product in ascending order---------------------");
		for (Customer n : l)
			System.out.println(n);
		
//		Comparator<Customer> customer1=(e1,e2)->{
//			return e1.getName().compareToIgnoreCase(e2.getName());
//		};
		Collections.sort(l, (e1,e2)->{
			return e1.getName().compareToIgnoreCase(e2.getName());
		});
		System.out.println("----------------------sorted by name----------------------------------------------------------");
		for (Customer n : l)
			System.out.println(n);
	}

}
