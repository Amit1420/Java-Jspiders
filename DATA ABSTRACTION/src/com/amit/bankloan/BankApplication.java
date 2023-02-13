package com.amit.bankloan;

import java.util.Scanner;

public class BankApplication 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
	    
		System.out.println("**************************************************** \n"+
                "************ Welcome to my Software...! ************ \n"				
	+            "**************************************************** \n");
System.out.println("*******Bank Application*******");
System.out.println("Choose The Bank For Taking Loan");
Salesman s=new Salesman();
		for(;;)
		{
			System.out.println("1. HDFC  \n"
					+ "2. SBI \n"
					+ "3. ICICI ");
		System.out.println("Enter your Choice: ");
		int choice = sc.nextInt();
		
		if(choice==1)
		{   System.out.println("Select which type of account you have in that particular bank");
			System.out.println("1. CURRENT ACCOUNT \n"
					+ "2. SAVING ACCOUNT \n"+"3. NO ACCOUNT"
					);
			choice=sc.nextInt();
			
			if(choice==1)
			{
				System.out.println("Enter Your Loan Amount");
		   	    double loanAmount=sc.nextInt();
		   	    
		   	    s.salesForLoan(new Hdfc(), loanAmount);
			}
			else if(choice==2)
			{
				System.out.println("Enter Your Loan Amount");
		   	    double loanAmount=sc.nextInt();
		   	    s.salesForLoan(new Hdfc(),loanAmount);
			}
			else if(choice==3)
			{
				System.out.println("You have to open new account then we can process your loan");
			}
		 
		}
			else if(choice==2)
		{   System.out.println("Select which type of account you have in that particular bank");
			System.out.println("1. CURRENT ACCOUNT \n"
					+ "2. SAVING ACCOUNT \n"+"3. NO ACCOUNT"
					);
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter Your Loan Amount");
		   	    double loanAmount=sc.nextInt();
		   	    s.salesForLoan(new Sbi(),loanAmount);
			}
			else if(choice==2)
			{
				System.out.println("Enter Your Loan Amount");
		   	    double loanAmount=sc.nextInt();
		   	    s.salesForLoan(new Sbi(),loanAmount);
			}
			else if(choice==3)
			{
				System.out.println("You have to open new account then we can process your loan");
			}
		 
		}
		else if(choice==3)
		{   System.out.println("Select which type of account you have in that particular bank");
			System.out.println("1. CURRENT ACCOUNT \n"
					+ "2. SAVING ACCOUNT \n"+"3. NO ACCOUNT"
					);
			choice=sc.nextInt();
			if(choice==1)
			{
				System.out.println("Enter Your Loan Amount");
		   	    double loanAmount=sc.nextInt();
		   	    s.salesForLoan(new Icici(),loanAmount);
			}
			else if(choice==2)
			{
				System.out.println("Enter Your Loan Amount");
		   	    double loanAmount=sc.nextInt();
		   	    s.salesForLoan(new Icici(),loanAmount);
			}
			else if(choice==3)
			{
				System.out.println("You have to open new account then we can process your loan");
			}
		 
		}
		System.out.println("Do you want to continue? Y/y");
		char ch = sc.next().charAt(0);
		
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
