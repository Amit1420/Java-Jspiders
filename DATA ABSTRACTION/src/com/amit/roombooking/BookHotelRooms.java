package com.amit.roombooking;

public class BookHotelRooms 
{

	public static void main(String[] args) 
	{
		System.out.println("**************************************************** \n"+
                "************ Welcome to Room Booking Application...! ************ \n"				
	+            "**************************************************** \n");
		
		BookingApplication customer1=new BookingApplication();
		customer1.bookRoom();
		
		BookingApplication customer2=new BookingApplication();
		customer2.bookRoom();
		
		BookingApplication customer3=new BookingApplication();
		customer3.bookRoom();
		
		
	}

}



