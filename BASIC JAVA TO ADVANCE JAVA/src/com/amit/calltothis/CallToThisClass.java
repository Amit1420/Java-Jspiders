package com.amit.calltothis;
class Rectangle
{
	int length,breadth;
	public Rectangle(int length,int breadth)
	{
		this.length=length;
		this.breadth=breadth;
	}
	public Rectangle(int num)
	{
		this(num,num);
	}
	/*public int Rectangle()
	{
		int area=length*breadth;
		return area;
	}
	*/
	public void displayArea()
	{
		System.out.println("Length : "+length);
		System.out.println("Breadth : "+breadth);
	}
	public void calcArea() 
	{
	 int area=length*breadth;
	 System.out.println("Area = "+area);
	 System.out.println("********************************");
	}
}
public class CallToThisClass 
{

	public static void main(String[] args) 
	{
		Rectangle r1=new Rectangle(8,5);
		r1.displayArea();
		r1.calcArea();
		//System.out.println(r1.Rectangle());
		
		Rectangle r2=new Rectangle(6);
		r2.displayArea();
		r2.calcArea();
		
	}

}
