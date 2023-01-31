// Program using the concept of Aggregation And Composition
package com.amit.assignment;

import java.util.Scanner;

class Jio
{
	String simName;
	public Jio(String simName)
	{
		this.simName=simName;
	}
	public void callThroughJio()
	{
		System.out.println("We Can Call Through "+simName+" And We Can Also Use Internet");
	}
}
class Airtel
{
	String simName;
	public Airtel(String simName)
	{
		this.simName=simName;
	}
	public void callThroughAirtel()
	{
		System.out.println("We Can Call Through "+simName+" But We Can't Use Internet");
	}
}
class Battery
{
	String batteryName;
	public Battery(String batteryName)
	{
		this.batteryName=batteryName;
	}
}
class Phone
{
	Battery battery;
	Jio jio;
	Airtel airtel;
	String phoneName;
	public Phone(String phoneName,Battery battery)
	{
		this.phoneName=phoneName;
		this.battery=battery;
	}
	public void call()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Jio\n2. Airtel");
		int selectSim=sc.nextInt();
		
		if(selectSim==1)
		{
			jio=new Jio("Jio");
			jio.callThroughJio();
		}
		else if(selectSim==2)
		{
			airtel=new Airtel("Airtel");
			airtel.callThroughAirtel();
		}
		
	}
}
public class PhoneDevwlopment 
{
	public static void main(String[] args) 
	{
		Phone phone1=new Phone("Nokia",new Battery("Lithium-ion"));
		phone1.call();
	}
}
