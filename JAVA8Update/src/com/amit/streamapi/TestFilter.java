package com.amit.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestFilter {

	public static void main(String[] args) {
		List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(15);
        list.add(25);
        list.add(20);
        list.add(30);
        list.add(38);
        list.add(32);
        list.add(36);
        list.add(14);
        list.add(16);
        list.add(8);
        list.add(3);
        list.add(12);
        list.add(13);
        list.add(18);
        list.add(25);
        list.add(38);
        list.add(40);
        
//        List<Integer> list1=new ArrayList<>();
//        
//        for(Integer n:list)
//        {
//        	if(n%2==0)
//        	{
//        	 list1.add(n);	
//        	}
//        }
//        System.out.println(list1);
//        List<Integer> list1=list.stream().filter(e->e%2==0)
//        .collect(Collectors.toList());
//        System.out.println(list1);
      
        Predicate<Integer> per =new Predicate<Integer>() {
        	@Override 
        	public boolean test(Integer t)
        	{
        		return t%2==0;
        	}
		};
		
		Stream<Integer> stream=list.stream();
		Stream<Integer> stream2=stream.filter(per);
		List<Integer> list1=stream2.collect(Collectors.toList());
		System.out.println(list1);
	}
	

}
