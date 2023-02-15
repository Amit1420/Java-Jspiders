package com.amit.ticketbooking;

public class BookMyShow 
{

	public static void main(String[] args) 
	{
		System.out.println("**************************************************** \n"+
                "************ Welcome to BookMyShow...! ************ \n"				
	+            "**************************************************** \n");
		System.out.println();
		BookingApp customer1=BookingApp.getInstance();
		customer1.bookTickets();
		
//		BookingApp customer2=BookingApp.getInstance();
//		customer2.bookTickets();
//		
//		BookingApp customer3=BookingApp.getInstance();
//		customer3.bookTickets();
		
			
	}

}
