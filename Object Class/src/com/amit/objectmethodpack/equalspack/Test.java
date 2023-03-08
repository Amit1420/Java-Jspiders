package com.amit.objectmethodpack.equalspack;

class A {
	int i;

	public A(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "A [i=" + i + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof A))
			return false;
		return this.i == ((A) obj).i;
	}

}

public class Test {

	public static void main(String[] args) {
		A a = new A(10);
		A a1 = new A(10);
		A a2 = new A(10);
		
		System.out.println(a == a1);
		System.out.println(a.equals(a1));
		
		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		
		System.out.println(a2 == a);
		System.out.println(a2.equals(a));

	}

}
