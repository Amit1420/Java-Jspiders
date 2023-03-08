package com.amit.pack1;

class A{
	protected int x;
	
	protected void m1(){
		System.out.println("Oops Completed Successfully"); 
	 }
}
class B extends A{
	
}
public class Test {

	public static void main(String[] args) {
		B b = new B();
		b.m1();
	}

}
