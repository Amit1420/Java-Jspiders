package com.amit.pack3;
class A
{
	int i=100;
}
class B extends A
{
	int i=250;
	public void display()
	{
		System.out.println("super i = "+super.i);
		System.out.println("i = " +i);
		
	}
}
public class CastingAccess {

	public static void main(String[] args) {
		
		A a=new B();
		((B)a).display();
		System.out.println(a.i);
		
		System.out.println(((B)a).i);
		
		
		
				
	}

}
