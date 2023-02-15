package com.amit.ticketbooking;

class Theatre 
{
   private static int seats=50;
   private static Theatre t;
   public  void reserveSeat(int numberOfSeat)
   {
	   if(numberOfSeat<seats)
	   {
		   if(numberOfSeat<=5)
		   {
			   System.out.println("Booking Confirmed : "+numberOfSeat+ " Tickets");  
			   seats=seats-numberOfSeat;
		   }
		   else
		   {
			   System.out.println("You cannot book ticket because You can book atmost 5 tickets at a time ");
			   
		   }
		   
	   }
	   else System.out.println("Ticket Not Available");
	   
	   System.out.println("Available Ticket : "+seats);
	 
	   
   }
   private Theatre()
   {
	   
   }
   public static Theatre getInstance()
	{
		if(t==null) t=new Theatre();
		return t;
	}
  
}
