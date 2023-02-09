package com.amit.courses;

import com.amit.collegedetails.College;

public class Courses extends College
{
  public String courses;

public Courses(String collegeName, String collegeAddress, String universityName, String courses) {
	super(collegeName, collegeAddress, universityName);
	this.courses = courses;
}
public void displayCoursesDetails()
{
	dislpayCollegeDetails();
	System.out.println();
	System.out.println("Courses Available : "+courses);
}
  
}
