package com.amit.studentdetails;

public class Student
{
	public int stud_id;
	public int age;
	public String stud_name,gender,address,contact_number,aadhar_number;

	public void displayStudentDetails()
	{   
		System.out.println("Student Id : "+this.stud_id);
		System.out.println("Name : "+this.stud_name);
		System.out.println("Age : "+this.age);
		System.out.println("Gender : "+this.gender);
		System.out.println("Address : "+this.address);
		System.out.println("Contact Number : "+this.contact_number);
		System.out.println("Aadhar Number : "+this.aadhar_number);
		System.out.println("**********************************************************");
		
	}

}
