package com.amit.javaprogrampack;


class Student{
	int roll_no;
	String name;
	static int[] marks= {80,70,80,90,85};
	public Student()
	{
		this(1,"KunMun",marks);
	}
	public Student(int roll_no, String name, int[] marks) {
		this.roll_no = roll_no;
		this.name = name;
		marks = Student.marks;
	}
	public void display()
	{
		System.out.println("Name : "+name);
		System.out.println("Roll No. : "+roll_no);
		int total=0;
		for(int i=0;i<marks.length;i++)
		{
			total=total+marks[i];
		}
		System.out.println("Total Marks : "+total);
		float percentage=(total/5)*100;
		if(percentage >= 60.00)
		{
			System.out.println("First Division");
		}
		else if(percentage < 60 && percentage >=50 )
		{
			System.out.println("Second Division");
		}
		else 
		{
			System.out.println("Third Division");
		}
		
	}
	
	
}
public class Demo1 {

	public static void main(String[] args) {
		Student student = new Student();
		student.display();
		
	}

}
