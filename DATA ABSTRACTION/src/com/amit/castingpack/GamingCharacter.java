package com.amit.castingpack;
/*
 Data Abstraction : Hiding information/essential features from user and providing only functionality/behaviour to users
 Upcasting is done to achieve data abstraction
 
 Upcasting : 
 * Converting sub class type to super class type is known as upcasting.
 * Creating the objects of sub class and storing it in super class reference is known as upcasting.
 * It is also known as Generalization or object level widening.
 * It is implicit and explicit.
 * IS-A relationship is mandatory.
 * Super class -> A
   Sub class -> B
   A a=(A) new B(); // explicit
   A a=new B(); // implicit
 *Upcasting can be achieved without downcasting.
 *In Upcasting we can access :
	->generic properties(data member and methods) of super class.
	->overriding methods of Sub class
*In Upcasting we cannot access the specific methods of sub class.
*Upcasting achieves Data Abstraction.

Downcasting : 

*Converting super class type to sub class type is known as downcasting.
*Creating the reference of sub class and pointing it to upcasting reference of super class is known as downcasting.
* It is also known as Specialization or object level narrowing.
* It is always explicit.
* IS-A relationship is mandatory.
* Super class -> A
  Sub class -> B
   B b=(B) a;
   b.sm();
   ((B)a).sm();

* Downcasting cannot be achieved without upcasting.
* In downcasting we can access :
	->specific methods of Sub class
	->all the properties of sub class and super class
*Downcasting not achieve Data Abstraction.
 */
abstract class Animal
{
	public void drinkWater() //generic method
	{
		System.out.println("Every Animal requires water to survive");
	}
	abstract public void sound(); // overridden method
	
	abstract public void movement(); // overridden method
	
}
class Lion extends Animal
{
	@Override
	public void sound() //overriding method
	{
		System.out.println("Lion Roars");
	}
	@Override
	public void movement() //overriding method
	{
		System.out.println("Lion Runs/Walks");
	}
	public void preyFinding() //specific method
	{
		System.out.println("Attacks the prey and finds living");
	}
}
class Snake extends Animal
{
	@Override
	public void sound()  //overriding method
	{
		System.out.println("Hhhhhsssssssssssssssssssssssss");
	}
	@Override
	public void movement() //overriding method
	{
		System.out.println("Nagin Dance");
	}
	public void venomUse() //specific method
	{
		System.out.println("Snakes venom is medicinal when used ");
	}
}
public class GamingCharacter 
{

	public static void main(String[] args) 
	{
		Animal animal=new Lion(); // upcasting 
		animal.drinkWater();
		animal.sound();
		animal.movement();
		
		Lion lion=(Lion)animal; // downcasting
		lion.preyFinding();
		
		System.out.println("\"\"\"\"\"");
		
		Animal animal1=new Snake(); // upcasting
		animal1.drinkWater();
		animal1.sound();
		animal1.movement();
		
		Snake snake=(Snake)animal1; // downcasting
		snake.venomUse();
		
	}

}
