package com.amit.cardevelopment;

class Car {
	String carName;
	String color;
	double price;
	int mileage;
	int fuelCapacity;
	Engine engine;
	
	public Car(String carName, String color, double price, int mileage, int fuelCapacity, Engine engine) {
		this.carName = carName;
		this.color = color;
		this.price = price;
		this.mileage = mileage;
		this.fuelCapacity = fuelCapacity;
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", color=" + color + ", price=" + price + ", mileage=" + mileage
				+ ", fuelCapacity=" + fuelCapacity + ", Engine=" + engine + "]";
	}
public boolean equals(Object obj) {
	if(!(obj instanceof Car)) return false;
	Car car=(Car) obj;
	return this.carName.equals(car.carName) && 
			this.color.equals(car.color) && 
			this.price==car.price && 
			this.mileage==car.mileage &&
			this.fuelCapacity==car.fuelCapacity && 
			this.engine.equals(car.engine);
			
	
		
	}
	
	
	

}
