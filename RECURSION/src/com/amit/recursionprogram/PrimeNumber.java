package com.amit.recursionprogram;

import java.util.Scanner;

public class PrimeNumber 
{
  
	static boolean isPrime(int n,int i)
	   {
		   if(n<=2) return (n==2)?true:false;
		   if(n%i==0) return false;
		   if(i*i>n)return true;
		   
		   return isPrime(n, i+1);
	   }

	public static void main(String[] args) 
	{
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter A Number : ");
	  int n=sc.nextInt();
	  int i=2;
	  if(isPrime(n,2)) System.out.println("Prime Number");
	  else System.out.println("Not Prime NUmber");

	}
	   
}
