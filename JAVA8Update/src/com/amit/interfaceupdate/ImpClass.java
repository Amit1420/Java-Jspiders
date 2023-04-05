package com.amit.interfaceupdate;

public class ImpClass implements Interface1,Interface2 {
	@Override
	public void m1() {
     System.out.println("I'm m1() from implemented class");
	}

	@Override
	public void defaultMethod() {
//		Interface2.super.defaultMethod();
		System.out.println("common default method");
	}
}
