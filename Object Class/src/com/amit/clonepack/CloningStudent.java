
package com.amit.clonepack;

class Student implements Cloneable
{
	int sid;
	String sname;
	int sage;
	public Student(int sid, String sname, int sage) {
		super();
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
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}
	
}
public class CloningStudent {

	public static void main(String[] args)throws CloneNotSupportedException {
		
		Student s1 = new Student(1,"Amit", 23);
		System.out.println(s1);
		
		Student s2=(Student)s1.clone();
		System.out.println(s2);

	}

}
