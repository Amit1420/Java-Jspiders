package com.amit.typecasting;

class A
{
	public void m1()
	{
		System.out.println("Good Morning");
	}
	public void m2()
	{
		System.out.println("Hi");
	}
} 
class B extends A
{
	@Override
	public void m2()
	{
		System.out.println("Hello");
	}
	public void m3()
	{
		System.out.println("Welcome");
	}
}
public class Test 
{

	public static void main(String[] args) 
	{
		A a=new B();
		a.m1();
		a.m2();
		((B)a).m3();
	
	}

}
