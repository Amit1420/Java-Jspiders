package com.amit.objectmethodpack.tostringpack;



class Student
{
	int sid;
	String sname;
	int sage;
	
	public Student(int sid, String sname, int sage) {
		this.sid = sid;
		this.sname = sname;
		this.sage = sage;
	}

	@Override   
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", sage=" + sage + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student)) return false;
		return this.sid ==((Student) obj).sid && this.sname.equals(((Student)obj).sname) && this.sage == ((Student) obj).sage;
	}
}
public class StudentTest {
	

	public static void main(String[] args) {
		
	 Student s1 = new Student(1, "Amit", 23);
	 System.out.println(s1);
	 
	 Student s2= new Student(1, "Amit", 23);
	 System.out.println(s2);
	 System.out.println(s1==s2);
	 boolean res=s1.equals(s2);
	 if(res)
	 {
	 System.out.println("Don't Give Same Details ");
	 }

	}

}
