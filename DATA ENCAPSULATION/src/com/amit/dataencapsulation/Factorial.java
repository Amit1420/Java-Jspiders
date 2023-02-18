package com.amit.dataencapsulation;

import java.util.Scanner;

class A
{
	private int n;
    
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	public int factorial()
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			
			fact=fact*i;
			
		}
		return fact;
	}
	
}
public class Factorial {

	public static void main(String[] args) 
	{
		A a = new A();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number : ");
		int n=sc.nextInt();
        a.setN(n);
        if(n<0)System.out.println("No Negatives");
        else System.out.println(a.getN()+" != "+a.factorial());
		

	}

}
