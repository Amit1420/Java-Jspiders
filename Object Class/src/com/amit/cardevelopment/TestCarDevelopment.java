package com.amit.cardevelopment;

public class TestCarDevelopment {

	public static void main(String[] args) {
		Car car1=new Car("Swift", "Red", 500000, 25, 40, new Engine("GCXPK1234",250,2006));
		Car car2=new Car("Swift", "Red", 500000, 25, 40, new Engine("GCXPK1234",250,2006));
		
		if(car1.equals(car2)) System.out.println("Same Car with same Engine");
	}

}
