package com.amit.objectmethodpack.tostringpack;

class A {
   int i;
   public A(int i) {
	   this.i=i;
   }

@Override
public String toString() {
	return "A [i=" + i + "]";
}
   
}

public class Test {

	public static void main(String[] args) {
		A a = new A(10);
		System.out.println(a);
		
		A a1 = new A(50);
		System.out.println(a1);

	}

}
