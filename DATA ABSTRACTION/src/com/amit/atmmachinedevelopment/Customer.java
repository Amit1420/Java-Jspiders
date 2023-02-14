package com.amit.atmmachinedevelopment;

import java.util.Scanner;

public class Customer 
{
	public void servicesUsed(Bank bank)
	{
		int balance=100000;
		int password=1420;
		Scanner s = new Scanner(System.in);
		
System.out.println("*******ATM MACHINE OF "+bank.getClass().getSimpleName()+"*******");
		
		for(;;)
		{
			System.out.println("1. BALANCE ENQUIRY \n"
					+ "2. WITHDRAW \n"
					+ "3. DEPOSIT ");
		System.out.println("Enter your Choice: ");
		int choice = s.nextInt();
		if(choice==1)
		{
			System.out.println("1. CURRENT ACCOUNT \n"
					+ "2. SAVING ACCOUNT ");
			choice=s.nextInt();
			System.out.println("Enter Your Password");
			int pass=s.nextInt();
			if(pass==password)bank.balanceEnquiry(balance);
			else System.out.println("Your Password is Invalid");
			
		}
		else if(choice==2)
		{
			System.out.println("1. CURRENT ACCOUNT \n"
					+ "2. SAVING ACCOUNT ");
			choice=s.nextInt();
			System.out.println("Enter Your Password");
			int pass=s.nextInt();
			if(pass==password)
			{
				System.out.println("Enter Withdrawal Amount :");
				int withdrawAmount=s.nextInt();
				if((withdrawAmount>100)&&(withdrawAmount%100==0)&&(withdrawAmount<=10000))
				{
					if(withdrawAmount<balance)
					{
						bank.atmBalanceInfo(balance, withdrawAmount);
						
						
					}
					else
					{
						System.out.println("Insufficient Amount");
					}
				}
				else
				{
					System.out.println("Invalid Withdrawal Amount");
				}
				 
				
			}
			else System.out.println("Your Password is Invalid");
			
		}
		else if(choice==3)
		{
			System.out.println("1. CURRENT ACCOUNT \n"
					+ "2. SAVING ACCOUNT ");
			choice=s.nextInt();
			System.out.println("Enter Your Password");
			int pass=s.nextInt();
			if(pass==password)
			{
				System.out.println("Enter Deposit Amount :");
				int depositAmount=s.nextInt();
				bank.depositAmount(balance, depositAmount);
				
			}
			else System.out.println("Your Password is Invalid");
	
			
		}
		System.out.println("Do you want to continue? Y/y");
		char ch = s.next().charAt(0);
		
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
	}

}
