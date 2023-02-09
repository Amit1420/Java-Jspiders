package com.amit.driver;

import java.util.Scanner;
import com.amit.courses.Courses;
import com.amit.studentdetails.Student;

public class MainDriver 
{
	public static void main(String[] args) 
	{
		Courses courses = new Courses("RVS COLLEGE OF ENGINEERING AND TECHNOLOGY","JAMSHEDPUR,JHARKHAND-831012","JHARKHAND UNIVERSITY OF TECHNOLGY,RANCHI","B.Tech");
		Scanner sc = new Scanner(System.in);
		System.out.println("**************************************************** \n"+
                "************ Welcome to my Software...! ************ \n"				
                +"**************************************************** \n");
		System.out.println("******* STUDENT INFORMATION SYSTEM *******\n");
		courses.displayCoursesDetails();
		System.out.print("Enter the total number of Students to add their details :");
		int n=sc.nextInt();
		Student[] studentArray=new Student[n];
		
	        System.out.println("\n***Input the asked details***");
	        for(;;)
	        {
	        for(int i=0;i<n;i++)
	        {
	        	Student stud = new Student();
	        	studentArray[i]=stud;
	        System.out.print("Enter Student Id :");
	        stud.stud_id = sc.nextInt(); 
	        
	        System.out.print("Enter Age :");
	        stud.age = sc.nextInt();
	        
	        sc.nextLine();
	        System.out.print("Enter Name Of The Student :");
	        stud.stud_name = sc.nextLine();
	        
	        System.out.print("Enter Gender :");
	        stud.gender = sc.next();
	        
	        sc.nextLine();
	        System.out.print("Enter Address :");
	        stud.address = sc.nextLine();
	        
	        System.out.print("Enter Contact Number :");
	        stud.contact_number=sc.nextLine();
	        
	        System.out.print("Enter Aadhar Number :");
	        stud.aadhar_number=sc.nextLine();
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
	        	Student stud=studentArray[i];
	        	stud.displayStudentDetails();
	        }
		
		
	}

}
