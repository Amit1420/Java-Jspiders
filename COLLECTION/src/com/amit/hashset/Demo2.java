package com.amit.hashset;
class Student
{
	String name;
	int marks;
	public Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int hashCode() {
		return marks;
	}
	@Override
	public boolean equals(Object obj) {
		Student s=(Student)obj;
		return name.equals(s.name)&& marks==s.marks;
	}
	
}
public class Demo2 {

	public static void main(String[] args) {
	    Student s1 = new Student("shyam", 98);
	    Student s2 = new Student("ram", 89);
	    Student s3 = new Student("amit", 96);
	    Student s4 = new Student("amit", 96);
	    Student s5 = new Student("aayat", 78);
	    
	    Set s=new Set();
	    s.add(s1);
	    s.add(s2);
	    s.add(s3);
	    s.add(s4);
	    s.add(s5);
	   
	    System.out.println("Size :"+s.size() );
	    
	    s.display();

	}

}
