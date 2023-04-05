package com.amit.memberinnerclass;

public class OuterClass {
 private int a;
 public OuterClass()
 { 
 }
 public void value()
 {
	System.out.println("value() in OuterClass");
	a=25;
	System.out.println(a);
 }
 public class InnerClass
 {
	 public void innerMethod()
	 {   
		 System.out.println(a);
		 System.out.println("innerMethod()in InnerClass");
	 }
 }
}
