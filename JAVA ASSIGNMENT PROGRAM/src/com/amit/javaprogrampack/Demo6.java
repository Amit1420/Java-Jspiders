package com.amit.javaprogrampack;
class University
{
	String name="JHARKHAND UNIVERSITY OF TECHNOLOGY";
}
class College extends University{ 
	String name="RVS COLLEGE OF ENGINEERING AND TECHNOLOGY";
	
	public  void show()
	{
		System.out.println(name);
		System.out.println(super.name);
	}

}
public class Demo6 {

	public static void main(String[] args) {
		College c=new College();
		c.show();

	}

}
