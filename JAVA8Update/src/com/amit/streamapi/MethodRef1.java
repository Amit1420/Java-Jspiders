package com.amit.streamapi;

import java.util.stream.Stream;

import com.amit.lambda.Customer;

public class MethodRef1 {
	public static void displayName(Customer o)
	{
		System.out.println(o.getName().toUpperCase());
	}
	public Stream<Customer> perform(Customer t)
	{
		Customer c1=new Customer(t.getId(),t.getName().toUpperCase(),t.getProduct(),t.getType());
		Customer c2=new Customer(t.getId(),t.getName(),t.getProduct().toUpperCase(),t.getType());
		return Stream.of(c1,c2);
	}

}
