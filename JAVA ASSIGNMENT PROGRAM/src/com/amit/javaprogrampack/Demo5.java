package com.amit.javaprogrampack;
class Addition
{
	int a,b;

	public Addition(int a, int b) 
	{
		this.a = a;
		this.b = b;
		System.out.println(this.a+" + "+this.b+" = "+(this.a+this.b));
		System.out.println(this.a+" * "+this.b+" = "+(this.a*this.b));
		
	}
	
}
public class Demo5 {

	public static void main(String[] args) {
		Addition a = new Addition(10,20);

	}

}
