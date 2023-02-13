package com.amit.cardevelopment;

public class Swift extends Car
{
	@Override
	public void start()
	{
		System.out.println("Key Start");
	}
	@Override
	public void accelerate()
	{
		System.out.println("Half Clutch Drive");
	}
	@Override
	public void stop()
	{
		System.out.println("Key Stop");
	}
	public void bluetooth()  
	{
		System.out.println("JBL bluetooth for swift car installed");
	}

	
}
