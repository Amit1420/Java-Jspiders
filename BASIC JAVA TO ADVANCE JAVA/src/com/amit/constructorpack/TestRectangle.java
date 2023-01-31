package com.amit.constructorpack;

class Rectangle
{
	int length;
	int breadth;

	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public void displayArea()
	{
		int area=length*breadth;
		System.out.println("Length : "+length);
		System.out.println("Breadth : "+breadth);
		System.out.println("Area of Rectangle : "+area);
		System.out.println("*******************************");
	}
}

public class TestRectangle 
{

	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(7,4);
		r1.displayArea();
		
		Rectangle r2=new Rectangle(12,6);
		r2.displayArea();

	}

}
