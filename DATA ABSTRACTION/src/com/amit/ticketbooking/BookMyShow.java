package com.amit.ticketbooking;


public class BookMyShow 
{

	public static void main(String[] args) 
	{
		System.out.println("**************************************************** \n"+
                "************ Welcome to BookMyShow...! ************ \n"				
	+            "**************************************************** \n");
		System.out.println();
		BookingApp customer1= new BookingApp();
		customer1.bookTickets();
		
		BookingApp customer2=new BookingApp();
		customer2.bookTickets();
		
		BookingApp customer3=new BookingApp();
		customer3.bookTickets();
		
			
	}

}
