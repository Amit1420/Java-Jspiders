package com.amit.collegedetails;

public class College 
{
	public  String collegeName;
	public  String collegeAddress;
	public  String universityName;
	public College(String collegeName, String collegeAddress, String universityName) 
	{
		this.collegeName = collegeName;
		this.collegeAddress = collegeAddress;
		this.universityName = universityName;
	}
	public void dislpayCollegeDetails()
	{
		System.out.println("College Name :"+collegeName);
		System.out.println("Address :"+collegeAddress);
		System.out.println("Affiliated To :"+universityName);
	}

}
