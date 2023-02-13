package com.amit.programming;

import java.util.Scanner;

public class AtmMachine 
{
	static void holder()
	{   Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Account Number:");
		int a=sc.nextInt();
		switch(a)
		{
		case 1111:System.out.println("Hello Arun");
		System.out.println("Enter your ATM pin");
		
		for (int i=3;i>=1;i--)
		{
			int b=sc.nextInt();
		if(b==1111)
			return;
		System.out.println("Invalid input only "+(i-1)+" chance");
		}
		System.out.println("Your Account is blocked for 24 Hours");
		System.exit(0);
				
		case 2222:System.out.println("Hello Varun");
		System.out.println("Enter your ATM pin");
		for (int i=3;i>=1;i--)
		{
			int b=sc.nextInt();
		if(b==2222)
			return;
		System.out.println("Invalid input only "+(i-1)+" chance");
		}
		System.out.println("Your Account is blocked for 24 Hours");
		System.exit(0);
		
		case 3333:System.out.println("Hello Ram");
		System.out.println("Enter your ATM pin");
		for (int i=3;i>=1;i--)
		{
			int b=sc.nextInt();
		if(b==3333)
			return;
		System.out.println("Invalid input only "+(i-1)+" chance");
		}
		System.out.println("Your Account is blocked for 24 Hours");
		System.exit(0);
		
		case 4444:System.out.println("Hello Ravi");
		System.out.println("Enter your ATM pin");
		for (int i=3;i>=1;i--)
		{
			int b=sc.nextInt();
		if(b==4444)
			return;
		System.out.println("Invalid input only "+(i-1)+" chance");
		}
		System.out.println("Your Account is blocked for 24 Hours");
		System.exit(0);
		
		default:
			System.out.println("Invalid Account Number:");
			System.exit(0);
		}
	}
	public static void pressKey()
	{	
		Scanner sc=new Scanner(System.in);
		System.out.println("Successfully You have login");
		System.out.println("\t SBI ATM \t");
		System.out.println("Press Key");
		int Amount=20000;
		int temp=Amount;
		int count=0;
		while(count==0)
		{
			System.out.println("1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			int n=sc.nextInt();
		switch(n)
		{
		case 1:System.out.println("Enter the Amount to Deposit");
		      int d=sc.nextInt();
		      if(d%100!=0)
		      {
		    	  System.out.println("Invalid Input Deposit money in 2000,500,200,100");
		    	  break;
		      }
		      Amount=Amount+d;
		      System.out.println(d+" Amount is Deposited in your Account");
		      
		      break;
		case 2:System.out.println("Enter the Amount to WithDrawal");
	      d=sc.nextInt();
	      if(d%100!=0)
	      {
	    	  System.out.println("Invalid input the available Notes are 2000,500,200,100");
	    	  break;
	      }
	      Amount=Amount-d;
	      if(Amount<=2000)
	      {
	    	  System.out.println("Please Maintain Minimum Balance of 2000");
	    	  Amount=temp;
	    	  break;
	      }
	      {
	    	  if(d>=2000)
	    	  {
	    		  int e=d/2000;
	    		  d=d-(2000*e);
	    		  System.out.println("2000 X"+e+" ="+(2000*e));
	    	  }
	    	  if(d>=500)
	    	  {
	    		  int e=d/500;
	    		  d=d-(500*e);
	    		  System.out.println("500 X"+e+" ="+(500*e));  
	    	  }
	    	  if(d>=200)
	    	  {
	    		  int e=d/200;
	    		  d=d-(200*e);
	    		  System.out.println("200 X"+e+" ="+(200*e));  
	    	  }
	    	  if(d>=100)
	    	  {
	    		  int e=d/100;
	    		  d=d-(100*e);
	    		  System.out.println("100 X"+e+" ="+(100*e));  
	    	  }
	    	  System.out.println("Please Collect Your Cash");
	    	    
	      }
	      break;
		case 3:System.out.println("Balance in Your Account :"+Amount);
		break;
		case 4:System.out.println("Thank You Visit Again");
		System.exit(0);
		default:
		System.out.println("Invalid Input");
		
		}
		
		System.out.println("Do You want to Continue:Y/N");
		char d=sc.next().charAt(0);
		if(d=='n' ||d=='N')
		{
			count++;
		}
		
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Welcome to SBI ATM");
		holder();
		pressKey();
		System.out.println("Thankyou Visit Again");


	}

}

	