package com.amit.basicoops;

import java.util.Scanner;

class Student
{
	int stud_id,age;
	String stud_name,gender,address,contact_number,aadhar_number;
	static String stud_college_name="RVS COLLEGE OF ENGINEERING",stud_college_address="JAMSHEDPUR,JHARKHAND"; 
	/*
	public void initializeStudentDetails(int stud_id,int age,String stud_name,String gender,String address,String contact_number,String aadhar_number)
	{
		this.stud_id=stud_id;
		this.age=age;
		this.stud_name=stud_name;
		this.gender=gender;
		this.address=address;
		this.contact_number=contact_number;
		this.aadhar_number=aadhar_number;
		
	}
	*/
	public void displayStudentDetails()
	{   
		System.out.println("Student Id : "+this.stud_id);
		System.out.println("Name : "+this.stud_name);
		System.out.println("Age : "+this.age);
		System.out.println("Gender : "+this.gender);
		System.out.println("Address : "+this.address);
		System.out.println("Contact Number : "+this.contact_number);
		System.out.println("Aadhar Number : "+this.aadhar_number);
		System.out.println("College Name : "+stud_college_name);
		System.out.println("College Address : "+stud_college_address);
		System.out.println("**********************************************************");
		
	}
	/*
	public void searchStudentById(int stud_id)
	{
		if(this.stud_id==stud_id)
		{
			System.out.println("Student Id : "+this.stud_id);
			System.out.println("Name : "+this.stud_name);
			System.out.println("Age : "+this.age);
			System.out.println("Gender : "+this.gender);
			System.out.println("Address : "+this.address);
			System.out.println("Contact Number : "+this.contact_number);
			System.out.println("Aadhar Number : "+this.aadhar_number);
			System.out.println("College Name : "+stud_college_name);
			System.out.println("College Address : "+stud_college_address);
			System.out.println("**********************************************************");
			
		}
		else System.out.println("Not Available");
	}
	*/
	
}
public class StudentInfo 
{

	public static void main(String[] args) 
	{  
		
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************************************** \n"+
            "************ Welcome To My Software...! ************ \n"				
            +"**************************************************** \n");
		System.out.println("******* STUDENT INFORMATION SYSTEM *******\n");
		System.out.print("Enter the total number of Students to add their details :");
		int n=sc.nextInt();
		Student[] studentArray=new Student[n];
		
	        System.out.println("\n***Input the asked details***");
	        for(;;)
	        {
	        for(int i=0;i<n;i++)
	        {
	        	Student s=new Student();
	        	studentArray[i]=s;
	        System.out.print("Enter Student Id :");
	        s.stud_id = sc.nextInt(); 
	        
	        System.out.print("Enter Age :");
	        s.age = sc.nextInt();
	        
	        sc.nextLine();
	        System.out.print("Enter Name Of The Student :");
	        s.stud_name = sc.nextLine();
	        
	        System.out.print("Enter Gender :");
	        s.gender = sc.next();
	        
	        sc.nextLine();
	        System.out.print("Enter Address :");
	        s.address = sc.nextLine();
	        
	        System.out.print("Enter Contact Number :");
	        s.contact_number=sc.nextLine();
	        
	        System.out.print("Enter Aadhar Number :");
	        s.aadhar_number=sc.nextLine();
	        }
	        System.out.println("Do you want to continue? Y/y");
			char ch = sc.next().charAt(0);
			
			if(ch == 'y' || ch == 'Y') 
				continue;
			else
			{
				System.out.println("Sir/Madam, Its so nice having you..!");
				System.out.println("Thank you for  using the software");
				System.out.println("Visit Again");
				break;
			}
	        }
	        for(int i=0;i<n;i++)
	        {
	        	Student s=studentArray[i];
	        	s.displayStudentDetails();
	        }
	        
	       
		//s1.initializeStudentDetails(1, 20, "Amit Kumar", "Male", "Katghara,Nawadih,Bokaro,Jharkhand-829144", "+91 9973568704", "6352 9336 3163");
		//s2.initializeStudentDetails(2, 23, "Rahul Kumar", "Male", "Phusro,Bokaro,Jharkhand-829144", "+91 9065707076", "6200 9340 5663");
		//s3.initializeStudentDetails(3, 22, "Anmol Kumar", "Male", "Dhurwa,Ranchi,Jharkhand-834003", "+91 8540858396", "7256 7654 1238");
		
	    //s1.initializeStudentDetails(stud_id, age, stud_name, gender, address, contact_number, aadhar_number);
	  
		//s2.displayStudentDetails();
	    //s3.displayStudentDetails();
		
		//s[i].searchStudentById(1);
		
		
		

	}

}
