package com.amit.staticinnerclass;
public class OuterClass 
{
	public static class InnerClass
	{
		public static void innerMethod()
		{
			System.out.println("inner() from static innerClass");
		}
		public void nonStaticMethod()
		{
			System.out.println("non-static method in InnerClass");
		}
	}

}
