package com.amit.javaprogrampack;

import java.text.DecimalFormat;

public class Shape {
	public static void main(String[] args) {
		DecimalFormat df=new DecimalFormat("#.##");
	  double radius=3;
	  double base=6,height=4.0;
	  int length=10,breadth=5;
	  
	  System.out.println("Area of Circle = "+df.format(area(radius)));
	  System.out.println("Area of Triangle = "+area(base,height));
	  System.out.println("Area Of Rectangle = "+(int)area(length,breadth));

	}
	public static double area(double radius)
	{
		double area=(3.14*radius*radius);
		return area;
	}
	public static double area(double base,double height)
	{
		double area=(base*height)/2;
		return area;
	}
	public static double area(int length,int breadth)
	{
		double area=length*breadth;
		return area;
	}

}
