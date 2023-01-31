package com.amit.assignment;

import java.util.Scanner;

class Sum{
	public int length(int n)
	{
		int count=0;
		while(n>0)
		{
			int r=n%10;
			count++;
			n/=10;
		}
		return count;
	}
	public int reverseNumber(int n)
	{
		int rev=0;
		while(n>0)
		{
			int r=n%10;
			rev=rev*10+r;
			n/=10;	
		}
		return rev;
	}
}

	public class RequiredSum {
	public static void main(String[] args) {
		Sum s=new Sum();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter The Number : ");
		int n=sc.nextInt();
		int l=s.length(n);
		//System.out.println(l);
		int ar[]=new int[l];
		int temp=s.reverseNumber(n);
		//System.out.println(temp);
		int evenMul=1;
		int oddMul=1;
		for(int i=0;i<l;i++)
		{
			int r=temp%10;
			ar[i]=r;
			temp/=10;	
		}
		for(int i=0;i<l;i++)
		{
			if(i%2==0)
			{
				evenMul=evenMul*ar[i];
			}
			else
			{
				oddMul=oddMul*ar[i];
			}
		}
		int res=evenMul+oddMul;
		System.out.println("Required Sum : "+res);
		
	}

}
