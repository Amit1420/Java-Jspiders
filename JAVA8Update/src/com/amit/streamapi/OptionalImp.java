package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import com.amit.lambda.Customer;

public class OptionalImp {
	
	public static void main(String[] args) {
	Optional<Customer> dataById = getDataById(20);
	System.out.println(dataById);
	}
	public static Optional<Customer> getDataById(int id)
	{
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
		
		Supplier<Optional<Customer>> sup=new Supplier<Optional<Customer>>() {

			@Override
			public Optional<Customer> get() {
				return Optional.of(new Customer(id, null, null, null));
			}
		};
		
		Optional<Customer> or= l.stream().distinct().filter(e->e.getId()==id)
				.findFirst().or(sup);
		return or;
		
	}

}
