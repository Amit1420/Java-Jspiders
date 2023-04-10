package com.amit.streamapi;

import java.util.function.Predicate;

public class PredicateTest {

	public static void main(String[] args) {
		Predicate<Integer> p=e->e%2==0;
		
		String[] arr= {"abc","abcd","cgsghhs","jhasys","abvggst"};
		for(String obj:arr)
		{
			int len=obj.length();
			if(p.test(len)) System.out.println(obj);
		}

	}

}
//https://www.msn.com/en-in/lifestyle/shopping/apple-iphone-14-available-at-lowest-ever-price-here-s-how-to-get-in-just-rs-34-999-on-flipkart/ss-AA19iwF8?ocid=msedgdhp&pc=U531&cvid=f376a3cbebc74148b4f329d130f84bfb&ei=137