package com.amit.cardevelopment;

public class Audi extends Car
{
	@Override
	public void start()
	{
		System.out.println("Button Start");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Full Clutch Drive");
	}
	@Override
	public void stop()
	{
		System.out.println("Button Stop");
	}
	public void bluetooth()  
	{
		System.out.println("Sony bluetooth for Audi car installed");
	}
	
	public void AC() 
	{
		System.out.println("BlueStar Ac installed for Audi");
	}

 }
