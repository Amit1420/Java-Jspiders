package com.amit.basicoops;

import java.util.Scanner;

class Rectangle
{
	int length;
	int breadth;
	
	
	public void displayArea()
	{
		System.out.println("Length = "+length);
		System.out.println("Breadth = "+breadth);
	}
	public void initializeArea(int l,int b)
	{
		length =l;
		breadth=b;
	}
	public int calculateArea()
	{
		int area=length*breadth;
		return area;
	}
}
	
public class AreaOfRectangle 
{
public static void main(String[] args) 
{
	Rectangle r1 = new Rectangle();
	Rectangle r2 = new Rectangle();
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the length : ");
	int m=s.nextInt();
	System.out.println("Enter the breadth : ");
	int n=s.nextInt();
	r1.initializeArea(m, n);
	r1.displayArea();
	System.out.println("Area Of Rectangle = "+r1.calculateArea());
	
	System.out.println("******************************************");
	
	r2.initializeArea(12, 7);
	r2.displayArea();
	System.out.println("Area Of Rectangle = "+r2.calculateArea());
	
	
	
}
}

