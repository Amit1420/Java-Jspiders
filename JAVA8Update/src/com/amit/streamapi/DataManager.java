package com.amit.streamapi;

import java.util.List;
import java.util.stream.Collectors;

import com.amit.lambda.Customer;

public class DataManager {
	public List<Customer> sortedByName(List<Customer> list)
	{
	return list.stream().sorted((o1, o2) ->
o1.getName().compareToIgnoreCase(o2.getName()))
			.collect(Collectors.toList());
	}
	public List<Customer> sortedByProduct(List<Customer> list)
	{
		return list.stream().sorted((o1, o2) ->
o1.getProduct().compareToIgnoreCase(o2.getProduct()))
				.collect(Collectors.toList());
	}
}
