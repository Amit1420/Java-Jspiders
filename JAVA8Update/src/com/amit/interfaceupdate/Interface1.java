package com.amit.interfaceupdate;

public interface Interface1
{

	void m1();
	default void defaultMethod()
	{
		System.out.println("default method in Interface1");
	}
	public static void staticMethod()
	{
		System.out.println("static method in Interface1");
	}
	default int sum(int a,int b)
	{
		return a+b;
	}
}
