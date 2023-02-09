package com.amit.exercisedevelopers;

class Human
{
	String name,gender;
	int age;
	public Human(String name, String gender, int age) {
		super();
		this.name = name;
		this.gender = gender;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
class Doctor extends Human
{
	String specialist;
	public Doctor(String name, String gender, int age, String specialist) {
		super(name, gender, age);
		this.specialist=specialist;
	}
	@Override
	public String toString() {
		return "Doctor [name=" + name + ", gender=" + gender + ", specialist=" + specialist + ", age=" + age + "]";
	}
	
	
	
}
public class DoctorHistory 
{

	public static void main(String[] args) 
	{
		Doctor d=new Doctor("Vental Rao", "Male", 34, "Cardio");
		System.out.println(d.toString());
	}

}
