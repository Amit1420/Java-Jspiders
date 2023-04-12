package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.amit.lambda.Customer;

public class TestFlatMap3 {

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
		
//		Function<Customer, Stream<Customer>> fun = new Function<Customer,Stream<Customer>> ()
//				{
//
//					@Override
//					public Stream<Customer> apply(Customer t) {
//						Customer c1=new Customer(t.getId(),t.getName().toUpperCase(),t.getProduct(),t.getType());
//						Customer c2=new Customer(t.getId(),t.getName(),t.getProduct().toUpperCase(),t.getType());
//						return Stream.of(c1,c2);
//					}
//			
//				};
//				
				List<Customer> l2 = l.stream().flatMap(new MethodRef1()::perform).collect(Collectors.toList());
				Consumer<Customer> cus = new Consumer<Customer> () {

					@Override
					public void accept(Customer t) {
						System.out.println(t);
						
					}
					
				};
				Consumer<Customer> c2=System.out::println;
				
//				l2.forEach(e->System.out.println(e));
				l2.forEach(MethodRef1::displayName);
	
	}

}
