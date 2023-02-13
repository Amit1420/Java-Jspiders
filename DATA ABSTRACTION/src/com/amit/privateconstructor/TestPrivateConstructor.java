package com.amit.privateconstructor;
class A{
	int i=10; 
	static int count=0;
	private A()
	{
		i++;
		count++;
		System.out.println("Constructor Executed");
	}
	public void display()
	{
		System.out.println("i = "+i);
	}
	public static A getInstance()
	{
		return new A();
	}
}
public class TestPrivateConstructor 
{

	public static void main(String[] args) 
	{
	  A a1 = A.getInstance();
	  a1.display();
	  System.out.println(a1);
	  
	  A a2 = A.getInstance();
	  a2.display();
	  System.out.println(a2);
	  
	  System.out.println(a1==a2);
	  
	  
	  System.out.println(A.count);
	  
		

	}

}
