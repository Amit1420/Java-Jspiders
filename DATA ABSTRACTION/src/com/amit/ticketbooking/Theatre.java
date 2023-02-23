package com.amit.ticketbooking;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Theatre
{
	int th1seats = 50;
	
	private static Theatre t;

	public void reserveSeat(int numberOfSeat) {
		if (numberOfSeat < th1seats) {
			if (numberOfSeat <= 5) {
				System.out.println("Booking Confirmed : " + numberOfSeat + " Tickets");
				th1seats = th1seats - numberOfSeat;
			} else {
				System.out.println("You cannot book ticket because You can book atmost 5 tickets at a time ");

			}

		} else
			System.out.println("Ticket Not Available");
		
		LocalDateTime myDateObj = LocalDateTime.now();
//		   System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    String formattedDate = myDateObj.format(myFormatObj);
//		    System.out.println("After formatting: " + formattedDate);
		    System.out.println("Ticket Booking Date And Time : "+formattedDate);

//		System.out.println("Available Ticket : " + th1seats);

	}

	private Theatre() {

	}

	public static Theatre getInstance() {
		if (t == null)
			t = new Theatre();
		return t;
	}
	public void checkAvailability()
	{
		System.out.println("Available Ticket : " + th1seats);
	}

}
class Theatre2
{
	int th2seats = 100;
	private static Theatre2 t;

	public void reserveSeat(int numberOfSeat) {
		if (numberOfSeat < th2seats) {
			if (numberOfSeat <= 5) {
				System.out.println("Booking Confirmed : " + numberOfSeat + " Tickets");
				th2seats = th2seats - numberOfSeat;
			} else {
				System.out.println("You cannot book ticket because You can book atmost 5 tickets at a time ");

			}

		} else
			System.out.println("Ticket Not Available");
		 LocalDateTime myDateObj = LocalDateTime.now();
//		   System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    String formattedDate = myDateObj.format(myFormatObj);
//		    System.out.println("After formatting: " + formattedDate);
		    System.out.println("Ticket Booking Date And Time : "+formattedDate);

//		System.out.println("Available Ticket : " + th2seats);

	}

	private Theatre2() {

	}

	public static Theatre2 getInstance() {
		if (t == null)
			t = new Theatre2();
		return t;
	}
	public void checkAvailability()
	{
		System.out.println("Available Ticket : " + th2seats);
	}
	
}
class Theatre3
{
	int th3seats = 150;
	private static Theatre3 t;

	public void reserveSeat(int numberOfSeat) {
		if (numberOfSeat < th3seats) {
			if (numberOfSeat <= 5) {
				System.out.println("Booking Confirmed : " + numberOfSeat + " Tickets");
				th3seats = th3seats - numberOfSeat;
			} else {
				System.out.println("You cannot book ticket because You can book atmost 5 tickets at a time ");

			}

		} else
			System.out.println("Ticket Not Available");

		
		LocalDateTime myDateObj = LocalDateTime.now();
//		   System.out.println("Before formatting: " + myDateObj);
		    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		    String formattedDate = myDateObj.format(myFormatObj);
//		    System.out.println("After formatting: " + formattedDate);
		    System.out.println("Ticket Booking Date And Time : "+formattedDate);

//		System.out.println("Available Ticket : " + th3seats);

	}

	private Theatre3() {

	}

	public static Theatre3 getInstance() {
		if (t == null)
			t = new Theatre3();
		return t;
	}
	public void checkAvailability()
	{
		System.out.println("Available Ticket : " + th3seats);
	}

}
