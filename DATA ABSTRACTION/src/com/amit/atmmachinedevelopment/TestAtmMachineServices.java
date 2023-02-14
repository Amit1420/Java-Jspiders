package com.amit.atmmachinedevelopment;

import java.util.Scanner;

public class TestAtmMachineServices 
{

	public static void main(String[] args) 
	{
		Customer customer = new Customer();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("**************************************************** \n"+
                "************ Welcome to my Software...! ************ \n"				
	+            "**************************************************** \n");
		System.out.println("Select which Bank Atm you want to use ");
		System.out.println("1. AXIS  \n"
				+ "2. HDFC  \n"+"32. SBI  \n"+"4. PNB  ");
				
	System.out.println("Enter your Choice: ");
	int choice=sc.nextInt();
	if(choice==1)
	{
		customer.servicesUsed(new Axis());
	}
	else if(choice==2)
	{
		customer.servicesUsed(new Hdfc());
	}
	else if(choice==3)
	{
		customer.servicesUsed(new Sbi());
	}
	else 
	{
		customer.servicesUsed(new Pnb());
		
	}
		
	}


}

