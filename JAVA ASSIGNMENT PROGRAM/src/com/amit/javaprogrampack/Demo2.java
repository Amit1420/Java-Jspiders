package com.amit.javaprogrampack;
class Person
{
	String name,dob,pan;

}
class Employee extends Person
{
	String designation;
	float salary;
	public Employee(String name, String dob, String pan, String designation, float salary) {
		super();
		this.name = name;
		this.dob = dob;
		this.pan = pan;
		this.designation = designation;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dob=" + dob + ", pan=" + pan + ", designation=" + designation + ", salary="
				+ salary + "]";
	}

}
public class Demo2 {

	public static void main(String[] args) {
		Employee e=new Employee("Amit Kumar", "05-09-1999", "GCXPK0919K", "Software Developer", 45000);
        System.out.println(e.toString());
	}

}
