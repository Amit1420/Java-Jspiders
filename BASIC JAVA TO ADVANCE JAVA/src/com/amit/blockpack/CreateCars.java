package com.amit.blockpack;
class Car
{
	String carName,color;
	static int carNo=410;
	{
		carNo++;
	}
	public Car(String carName)
	{
		this.carName=carName;
		color="White";
	}
	public Car(String carName,String color)
	{
		this.carName=carName;
		this.color=color;
	}
	public void displayCarDetails()
	{
		System.out.println("Car Name : "+carName);
		System.out.println("Car No : "+"BNRqe"+carNo);
		System.out.println("Car Color : "+color);
		System.out.println("****************************");
		
	}
	
}
public class CreateCars 
{

	public static void main(String[] args) 
	{
		Car c1=new Car("Swift");
		c1.displayCarDetails();
		Car c2=new Car("Kia","Black");
		c2.displayCarDetails();
	

	}

}
