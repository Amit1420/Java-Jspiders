package com.amit.ticketbooking;

import java.util.Scanner;

class BookingApp {

	public void bookTickets()
	{
		Scanner sc = new Scanner(System.in);
		int choice = 0;
		System.out.println("PATHAN IS AVAILABLE IN THEATRE1");
		System.out.println("FREDDY IS AVAILABLE IN THEATRE2");
		System.out.println("AVATAR :THE WAY OF WATER IS AVAILABLE IN THEATRE3");
		System.out.println();
		for (;;) {
			System.out.println("Select the Movie :");
			System.out.println("1. PATHAAN \n" + "2. FREDDY  \n" + "3. AVATAR : THE WAY OF WATER ");
			choice = sc.nextInt();
			System.out.println("Select the Theatre :");
			System.out.println("1. THEATRE1 \n" + "2. THEATRE2  \n" + "3. THEATRE3 ");
			int thchoice = sc.nextInt();
			if (choice == thchoice) {
				System.out.println("Select the language :");
				System.out.println("1. ENGLISH \n" + "2. HINDI  \n" + "3. TAMIL ");
				choice = sc.nextInt();
				System.out.println("Select the Show :");
				System.out.println("1. Morning \n" + "2. AfterNoon  \n" + "3. Evening ");
				choice = sc.nextInt();
				System.out.println("Select the option :");
				System.out.println("1. To Book Tickets \n" + "2. To check Availability Of Tickets");
				choice=sc.nextInt();
				if(choice==1)
				{
				System.out.println("Do you want to bookTicket? Y/y");
				char ch = sc.next().charAt(0);
				if (ch == 'y' || ch == 'Y') {
					System.out.println("How many seats you want to book ?");
					int numberOfSeat = sc.nextInt();
					if(thchoice==1)
					{
					Theatre th = Theatre.getInstance();
					th.reserveSeat(numberOfSeat);
					break;
					}
					else if(thchoice==2)
					{
						Theatre2 th = Theatre2.getInstance();
						th.reserveSeat(numberOfSeat);
						break;
					}
					else if(thchoice==3)
					{
						Theatre3 th = Theatre3.getInstance();
						th.reserveSeat(numberOfSeat);
						break;
					}
					
				} else {
					System.out.println("Movie is not Available");
					System.out.println("Do you want to :");
					System.out.println("1. Exit \n" + "2. Continue ");
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Sir/Madam, Its so nice having you..!");
						System.out.println("Thank you for  using BookMyShow");
						System.out.println("Visit Again");
						break;
					} else if (choice == 2) {
						continue;
					}
				}
				}
				else if(choice==2)
				{
//					System.out.println("Select the Theatre :");
//					System.out.println("1. THEATRE1 \n" + "2. THEATRE2  \n" + "3. THEATRE3 ");
//					thchoice = sc.nextInt();
					if(thchoice==1)
					{
					Theatre th = Theatre.getInstance();
					th.checkAvailability();
					}
					else if(thchoice==2)
					{
						Theatre2 th = Theatre2.getInstance();
						th.checkAvailability();
					}
					else if(thchoice==3)
					{
						Theatre3 th = Theatre3.getInstance();
						th.checkAvailability();
					}
					System.out.println("Do you want to :");
					System.out.println("1. Exit \n" + "2. Continue ");
					choice = sc.nextInt();
					if (choice == 1) {
						System.out.println("Sir/Madam, Its so nice having you..!");
						System.out.println("Thank you for  using BookMyShow");
						System.out.println("Visit Again");
						break;
					} else if (choice == 2) {
						continue;
					}
					
				}
				
//			} else {
//				System.out.println("Movie is not Available");
//				System.out.println("Do you want to :");
//				System.out.println("1. Exit \n" + "2. Continue ");
//				choice = sc.nextInt();
//				if (choice == 1) {
//					System.out.println("Sir/Madam, Its so nice having you..!");
//					System.out.println("Thank you for  using BookMyShow");
//					System.out.println("Visit Again");
//					break;
//				} else if (choice == 2) {
//					continue;
//				}
//				if (choice == thchoice) {
//					System.out.println("Select the language :");
//					System.out.println("1. ENGLISH \n" + "2. HINDI  \n" + "3. TAMIL ");
//					choice = sc.nextInt();
//					System.out.println("Select the Show :");
//					System.out.println("1. Morning \n" + "2. AfterNoon  \n" + "3. Evening ");
//					choice = sc.nextInt();
//					System.out.println("Do you want to bookTicket? Y/y");
//					char ch = sc.next().charAt(0);
//					if (ch == 'y' || ch == 'Y') {
//						System.out.println("How many seats you want to book ?");
//						int numberOfSeat = sc.nextInt();
//						Theatre2 th = Theatre2.getInstance();
//						th.reserveSeat(numberOfSeat);
//						break;
//					} else {
//						System.out.println("Do you want to :");
//						System.out.println("1. Exit \n" + "2. Continue ");
//						choice = sc.nextInt();
//						if (choice == 1) {
//							System.out.println("Sir/Madam, Its so nice having you..!");
//							System.out.println("Thank you for  using BookMyShow");
//							System.out.println("Visit Again");
//							break;
//						} else if (choice == 2) {
//							continue;
//						}
//					}
//				} else {
//					System.out.println("Movie is not Available");
//					System.out.println("Do you want to :");
//					System.out.println("1. Exit \n" + "2. Continue ");
//					choice = sc.nextInt();
//					if (choice == 1) {
//						System.out.println("Sir/Madam, Its so nice having you..!");
//						System.out.println("Thank you for  using BookMyShow");
//						System.out.println("Visit Again");
//						break;
//					} else if (choice == 2) {
//						continue;
//					}
//					if (choice == thchoice) {
//						System.out.println("Select the language :");
//						System.out.println("1. ENGLISH \n" + "2. HINDI  \n" + "3. TAMIL ");
//						choice = sc.nextInt();
//						System.out.println("Select the Show :");
//						System.out.println("1. Morning \n" + "2. AfterNoon  \n" + "3. Evening ");
//						choice = sc.nextInt();
//						System.out.println("Do you want to bookTicket? Y/y");
//						char ch = sc.next().charAt(0);
//						if (ch == 'y' || ch == 'Y') {
//							System.out.println("How many seats you want to book ?");
//							int numberOfSeat = sc.nextInt();
//							Theatre3 th = Theatre3.getInstance();
//							th.reserveSeat(numberOfSeat);
//							break;
//						} else {
//							System.out.println("Do you want to :");
//							System.out.println("1. Exit \n" + "2. Continue ");
//							choice = sc.nextInt();
//							if (choice == 1) {
//								System.out.println("Sir/Madam, Its so nice having you..!");
//								System.out.println("Thank you for  using BookMyShow");
//								System.out.println("Visit Again");
//								break;
//							} else if (choice == 2) {
//								continue;
//							}
//						}
//					}
//				}
            
			}
			else {
				System.out.println("Movie is not Available");
				System.out.println("Do you want to :");
				System.out.println("1. Exit \n" + "2. Continue ");
				choice = sc.nextInt();
				if (choice == 1) {
					System.out.println("Sir/Madam, Its so nice having you..!");
					System.out.println("Thank you for  using BookMyShow");
					System.out.println("Visit Again");
					break;
				} else if (choice == 2) {
					continue;
				}

		}
//			if(choice==1 || choice==2 || choice==3)
//			{
//				System.out.println("Select the language :");
//				System.out.println("1. ENGLISH \n"
//						+ "2. HINDI  \n"+"3. TAMIL ");
//				choice=sc.nextInt();
//				System.out.println("Select the Show :");
//				System.out.println("1. Morning \n"
//						+ "2. AfterNoon  \n"+"3. Evening ");
//				choice=sc.nextInt();
//					
//			}

//			System.out.println("Do you want to bookTicket? Y/y");
//			char ch = sc.next().charAt(0);
//			if(ch == 'y' || ch == 'Y') 
//			{
//				System.out.println("How many seats you want to book ?");
//				int numberOfSeat=sc.nextInt();
//				Theatre th=Theatre.getInstance();
//				th.reserveSeat(numberOfSeat);
//				break;
//			}
//			else
//			{
//				System.out.println("Do you want to :");
//				System.out.println("1. Exit \n"
//						+ "2. Continue ");
//				choice=sc.nextInt();
//				if(choice==1)
//				{
//					System.out.println("Sir/Madam, Its so nice having you..!");
//					System.out.println("Thank you for  using BookMyShow");
//					System.out.println("Visit Again");
//					break;
//				}
//				else if(choice==2)
//				{
//					continue;
//				}
//			}
//		}

		}	
	}
}
