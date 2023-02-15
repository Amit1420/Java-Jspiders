package com.amit.programming;

public class A 
{
     int s=1;
	
	public static void main(String[] args) 
	{
		A a = new A();
	System.out.println(	a.m1(5));
	}
	public int m1(int n)
	{
		if(n==0)return s;
		s*=n;
		return m1(n-1);
	}

}
