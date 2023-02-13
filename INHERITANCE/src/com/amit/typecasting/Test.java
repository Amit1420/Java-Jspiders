package com.amit.typecasting;

class A
{
	int i=100;        // generic variable
	public void m1()  //generic method
	{
		System.out.println("Good Morning");
	}
	public void m2() //overridden method
	{
		System.out.println("Hi");
	}
} 
class B extends A
{
	int i=200;       // specific variable
	@Override
	public void m2() //overriding method
	{
		System.out.println("Hello");
	}
	public void m3()  //specific method
	{
		System.out.println("Welcome");
	}
}
public class Test 
{

	public static void main(String[] args) 
	{
		A a=new B(); //up casting
		System.out.println(a.i);
		a.m1();
		a.m2();
		((B)a).m3(); //down casting
		System.out.println(((B)a).i);
	}

}
