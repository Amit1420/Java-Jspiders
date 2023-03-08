package com.amit.interfacepack;

class A {
	int x;

	public A(int x) {
		this.x = x;
	}
	public A modify(int x)
	{
		if(this.x!=x)
		{
			return new A(x);
		}
		return this;
	}

}

public class ImmutableClass {

	public static void main(String[] args) {
		A a1 = new A(10);
		System.out.println(a1);
		
		A a2 = a1.modify(20);
		System.out.println(a2);
		
		A a3 = a1.modify(10);
		System.out.println(a3);


	}

}
