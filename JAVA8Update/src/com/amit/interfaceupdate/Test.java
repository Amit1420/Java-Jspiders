package com.amit.interfaceupdate;

public class Test {

	public static void main(String[] args) {
		ImpClass imp=new ImpClass();
		imp.m1();
		imp.defaultMethod();
		Interface1.staticMethod();
		int sum=imp.sum(10, 20);
		System.out.println("Sum : "+sum);
		imp.method2();

	}

}
