package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

import com.amit.lambda.Customer;

public class OptionalImp1 {
	public static Object getDataById(int id)
	{
		List<Customer> l = new ArrayList<>();
		l.add(new Customer(1, "Amit", "Potato", "Vegetables"));
//	Supplier<Optional<Customer>> sup = new Supplier<Optional<Customer>>() {
//	@Override
//	public Optional<Customer> get()
//	{
//		return Optional.empty();
//		
//	}
//	
//	};
		Supplier<Optional<Customer>> sup=()->Optional.empty();
		
		Optional<Customer> optional=l.stream().distinct().filter(e->e.getId()==id).findFirst().or(sup);
		if(optional.isPresent())
			return optional.get();
		else
			return "No data found for given id";
	}
		
	public static void main(String[] args) {
		System.out.println(getDataById(1));
	}

}
	
