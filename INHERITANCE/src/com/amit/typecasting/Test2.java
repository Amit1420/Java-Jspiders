package com.amit.typecasting;

class A1
{
	
}
class B1 extends A1
{
	
}
public class Test2 
{

	public static void main(String[] args) 
	{
		Object obj = new Object();
		System.out.println(obj instanceof Object);
		System.out.println(obj instanceof A1);
		System.out.println(obj instanceof B1);
		
		A1 a = new A1();
		System.out.println(a instanceof Object);
		System.out.println(a instanceof A1);
		System.out.println(a instanceof B1);
		
		B1 b=new B1();
		System.out.println(b instanceof Object);
		System.out.println(b instanceof A1);
		System.out.println(b instanceof B1);
		
		A1 a1=new B1();
		System.out.println(a1 instanceof Object);
		System.out.println(a1 instanceof A1);
		System.out.println(a1 instanceof B1);
		
		
	}

}
