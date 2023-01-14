package com.amit.assignment;

import java.util.Scanner;

public class AutoMorphic {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int n=num;
		int res=num*num;
		int rem=res%pow(length(num));
		if(rem==n) 
		{
			System.out.println("Number is AutoMorphic");
		}
		else
		{
			System.out.println("Number is not AutoMorphic");
		}
			
	}
	
	public static int length(int num)
	{
		int len=0;
		while(num>0)
		{
			len+=1;
			num/=10;
		}
		return len;
	}
	public static int pow(int len)
	{
		int result=1;
		while(len>0)
		{
			result=result*10;
			len--;
		}
		//System.out.println("Res :"+result);
		return result;
		
	}

}
