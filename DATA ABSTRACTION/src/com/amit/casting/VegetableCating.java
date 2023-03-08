package com.amit.casting;

import java.util.Scanner;

abstract class Vegetable
{
	abstract public void washingVegetables();
	
}
class Carrot extends Vegetable
{   @Override
	public void washingVegetables()
	{
		System.out.println("Luke warm water with salt soaked can wash the vegetables");
	}
	public void prepareHalwa()
	{
		System.out.println("Carrot Halwa is a traditional indian dessert");
	}
}
class Potato extends Vegetable
{
	@Override
	public void washingVegetables()
	{
		System.out.println("Luke warm water with salt soaked can wash the vegetables");
	}
	public void prepareFrenchFries()
	{
		System.out.println("Fries with more oil is good for health");
	}
}
class Shopkeeper
{
	public Vegetable sell(String vegName) 
	{
		if(vegName.equalsIgnoreCase("Carrot"))return new Carrot();
		if(vegName.equalsIgnoreCase("Potato"))return new Potato();
		System.out.println(vegName+" are not available");
		return null;
	}
}
public class VegetableCating 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Vegetable :");
		String VegName=sc.nextLine();
		Shopkeeper shopkeeper = new Shopkeeper();
		Vegetable veg=shopkeeper.sell(VegName);
		if(veg instanceof Carrot)
		{
			veg.washingVegetables();
			((Carrot)veg).prepareHalwa();
		}
		if(veg instanceof Potato)
		{
			veg.washingVegetables();
			((Potato)veg).prepareFrenchFries();
		}
		
		
	}

}
