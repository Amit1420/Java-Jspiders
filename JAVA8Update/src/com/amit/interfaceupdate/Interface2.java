package com.amit.interfaceupdate;

public interface Interface2 {
	default void method2()
	{
		System.out.println("default method in Interfcae2");
	}
	default void defaultMethod()
	{
		System.out.println("default method in Interface1");
	}

}
