package com.amit.javaprogrampack;

class A
{
	static int a=7,b=8;
	public static int add()
	{
		return a+b;
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		System.out.println("Addition of "+A.a+" and "+A.b+" is "+ A.add());

	}

}
