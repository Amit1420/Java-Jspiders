package com.amit.copyconstructor;
class Student
{
 int sid,age;
 String sname;
 public Student(int sid,String sname,int age)
 {
	 this.sid=sid;
	 this.sname=sname;
	 this.age=age;
 }
 public Student(int sid,Student s,int age)
 {
	 this.sid=sid;
	 this.sname=s.sname;
	 this.age=age;
 }
 public Student(int sid,String sname,Student s)
 {
	 this.sid=sid;
	 this.sname=sname;
	 this.age=s.age;
 }
 public void displayStudentInfo()
 {
	 System.out.println("Student Id : "+sid);
	 System.out.println("Student Name : "+sname);
	 System.out.println("Student Age : "+age);
 }
}

public class CopyConstructorClass 
{

	public static void main(String[] args) 
	{
		Student s1=new Student(1,"Raj",21);
		s1.displayStudentInfo();
		
		Student s2=new Student(2, s1, 22);
		s2.displayStudentInfo();
		
		Student s3=new Student(3, "Amit", s2);
		s3.displayStudentInfo();
		
		
		
		

	}

}
