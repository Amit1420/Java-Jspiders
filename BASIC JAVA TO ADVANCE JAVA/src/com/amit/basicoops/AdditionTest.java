package com.amit.basicoops;
class Addition
{
	int a;
	int b;
	int sum;
	public void m1()
	{
		System.out.println("Sum = "+this.sum);
		System.out.println("*********************************");
	}
	public void m1(int a)
	{
		this.a=a;
		this.sum=this.a;
		System.out.println("Sum = "+this.sum);
		System.out.println("*********************************");
	}
	public void m1(int a,int b)
	{ 
	  this.a=a;
	  this.b=b;
	  this.sum=this.a+this.b;
	  System.out.println("Sum = "+this.sum);
	  System.out.println("*********************************");
	}
	public void m1(int a,int b,int c)
	{
	
		  this.a=a;
		  this.b=b;
		  this.sum=this.a + this.b +c;
		  System.out.println("Sum = "+sum);
		  System.out.println("*********************************");
	}
	public void m1(int a,int b,int c,int d)
	{
		
		  this.a=a;
		  this.b=b;
		  this.sum=this.a + this.b +c+d;
		  System.out.println("Sum = "+sum);
		  System.out.println("*********************************");
	}
	public void m1(int a,int b,int c,int d,int e)
	{
	
		  this.a=a;
		  this.b=b;
		  this.sum=this.a + this.b +c+d+e;
		  System.out.println("Sum = "+sum);
		  System.out.println("*********************************");
	}
	public void m1(int... args)
	{
		
		this.a=args[0];
		this.b=args[1];
		this.sum=a+b;
		for(int i=2;i<args.length;i++)
		{
			this.sum=this.sum+args[i];
		}
		System.out.println("Sum = "+this.sum);
		System.out.println("*********************************");
	}
	
}
public class AdditionTest 
{

	public static void main(String[] args) 
	{
		Addition a1=new Addition();
		a1.m1();
		a1.m1(10);
		a1.m1(10, 20);
		a1.m1(10, 20, 30);
		a1.m1(10, 20, 30, 40);
		a1.m1(10, 20, 30, 40, 50);
		a1.m1(10, 20, 30, 40, 50, 60, 70);
	}

}
