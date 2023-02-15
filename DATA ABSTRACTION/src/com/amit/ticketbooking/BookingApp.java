package com.amit.ticketbooking;

import java.util.Scanner;


class BookingApp 
{
	private static BookingApp b;
	private BookingApp()
	{
		
	}
	public static BookingApp getInstance()
	{
		if(b==null) b=new BookingApp();
		return b;
	}
	public void bookTickets()

	{
		Scanner sc=new Scanner(System.in);
		int choice=0;
		for(;;)
		{
			System.out.println("Select the Movie :");
			System.out.println("1. PATHAAN \n"
					+ "2. FREDDY  \n"+"3. AVATAR : THE WAY OF WATER ");
			choice=sc.nextInt();
			if(choice==1 || choice==2 || choice==3)
			{
				System.out.println("Select the language :");
				System.out.println("1. ENGLISH \n"
						+ "2. HINDI  \n"+"3. TAMIL ");
				choice=sc.nextInt();
				System.out.println("Select the Show :");
				System.out.println("1. Morning \n"
						+ "2. AfterNoon  \n"+"3. Evening ");
				choice=sc.nextInt();
					
			}
			
			System.out.println("Do you want to bookTicket? Y/y");
			char ch = sc.next().charAt(0);
			if(ch == 'y' || ch == 'Y') 
			{
				System.out.println("How many seats you want to book ?");
				int numberOfSeat=sc.nextInt();
				Theatre th=Theatre.getInstance();
				th.reserveSeat(numberOfSeat);
				break;
			}
			else
			{
				System.out.println("Do you want to :");
				System.out.println("1. Exit \n"
						+ "2. Continue ");
				choice=sc.nextInt();
				if(choice==1)
				{
					System.out.println("Sir/Madam, Its so nice having you..!");
					System.out.println("Thank you for  using BookMyShow");
					System.out.println("Visit Again");
					break;
				}
				else if(choice==2)
				{
					continue;
				}
			}
		}
		
		
	}
	

}