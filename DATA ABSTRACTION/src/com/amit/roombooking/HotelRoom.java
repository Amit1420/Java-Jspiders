package com.amit.roombooking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class HotelRoom 
{
	
  int acRoom=20;
  int nonAcRoom=30;
  private static HotelRoom ht=null;
  
  private HotelRoom() 
  {
  }
  public static HotelRoom getInstance()
  {
	  if(ht==null) ht=new HotelRoom();
	  return ht;		  
  }
  Scanner sc=new Scanner(System.in);
  public void reserveRoom(int numberOfRoom)
  {   
	  System.out.println("Enter Your Booking Date : "+"Format should be dd-MM-yyyy only");
      String bdate=sc.next();
	  System.out.println("Select The ROOM TYPE : \n"+"1.AC ROOM \n"+"2.NON AC ROOM ");
	
	  int choice=sc.nextInt();
	  if(choice==1)
	  {
		  if(numberOfRoom>acRoom)
		  {
			  System.out.println(numberOfRoom+" Rooms Are Not Available ");
			  System.out.println(acRoom+" Rooms are Available");  
		  }
		  else
		  {
			  acRoom=acRoom-numberOfRoom;
			  System.out.println(numberOfRoom+" Rooms Are Booked");
			  LocalDateTime myDateObj = LocalDateTime.now();
//			   System.out.println("Before formatting: " + myDateObj);
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    String formattedDate = myDateObj.format(myFormatObj);
//			    System.out.println("After formatting: " + formattedDate);
			    System.out.println("Booking Date And Time : "+formattedDate);
			  System.out.println("You have to check-in the room at 12:00 P.M.on "+bdate);
			  System.out.println("Thanks For Your Booking!!!!!!!!!!!!");
		  }
	  }
	  else if(choice==2)
	  {
		  if(numberOfRoom>nonAcRoom)
		  {
			  System.out.println(numberOfRoom+" Rooms Are Not Available ");
		  }
		  else
		  {
			  nonAcRoom=nonAcRoom-numberOfRoom;
			  System.out.println(numberOfRoom+" Rooms Are Booked");
			  LocalDateTime myDateObj = LocalDateTime.now();
//			   System.out.println("Before formatting: " + myDateObj);
			    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
			    String formattedDate = myDateObj.format(myFormatObj);
//			    System.out.println("After formatting: " + formattedDate);
			    System.out.println("Booking Date And Time : "+formattedDate);
			  System.out.println("You have to check-in the room at 12:00 P.M.on "+bdate);
			  System.out.println("Thanks For Your Booking!!!!!!!!!!!!");
		  }
		  
	  }
	  
  }
  public  void displayAvailability()
  {
	  for(;;)
	  {
	  System.out.println("Select The ROOM TYPE : \n"+"1.AC ROOM \n"+"2.NON AC ROOM ");
		 int choice=sc.nextInt();
		 if(choice==1)
		 {
			 System.out.println("AC Rooms are available : "+acRoom);
		 }
		 else if(choice==2)
		 {
			 System.out.println("AC Rooms are available : "+nonAcRoom);
		 }
		 System.out.println("Do you want to continue? Y/y");
			char ch = sc.next().charAt(0);
			
			if(ch == 'y' || ch == 'Y') continue;
			else break;
		
	  }
	  
  }
  
  
  
}
