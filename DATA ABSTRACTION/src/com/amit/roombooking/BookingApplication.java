package com.amit.roombooking;

import java.util.Scanner;

class BookingApplication 
{
	public void bookRoom()
	{   
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
		System.out.println("Select One Option :");
		System.out.println("1. Book room for 1 person \n"+
		"2. Book room for 2 person \n"+
		"3. Book room for 3 person \n"+
		"4. Check Availability Of Room\n");
		int choice =sc.nextInt();
		if(choice==1)
		{
		System.out.println("How many rooms you want to book ?");
		int numberOfRoom = sc.nextInt();
		if(numberOfRoom==1)
		{
			HotelRoom ht=HotelRoom.getInstance();
			ht.reserveRoom(numberOfRoom);
		}
		else 
		{
			System.out.println("Sorry, you can't book "+numberOfRoom+" Rooms for 1 person only....");
			System.out.println("You can book only 1 room for atmost one person ");
		}
		}
		else if(choice==2)
		{
		System.out.println("How many rooms you want to book ?");
		int numberOfRoom = sc.nextInt();
		if(numberOfRoom<=2)
		{
			HotelRoom ht=HotelRoom.getInstance();
			ht.reserveRoom(numberOfRoom);
		}
		else 
		{
			System.out.println("Sorry, you can't book "+numberOfRoom+" Rooms for 2 person only....");
			System.out.println("You can book 2 room for atmost two person ");
		}
		
		}
		else if(choice==3)
		{
		System.out.println("How many rooms you want to book ?");
		int numberOfRoom = sc.nextInt();
		if(numberOfRoom<=3)
		{
			HotelRoom ht=HotelRoom.getInstance();
			ht.reserveRoom(numberOfRoom);
		}
		else 
		{
			System.out.println("Sorry, you can't book "+numberOfRoom+" Rooms for 3 person only....");
			System.out.println("You can book 3 room for atmost three person ");
		}
		
		}
		else if(choice==4)
		{
			HotelRoom ht=HotelRoom.getInstance();
			ht.displayAvailability();
			
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
