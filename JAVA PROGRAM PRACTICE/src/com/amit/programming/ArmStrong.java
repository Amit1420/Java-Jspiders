package com.amit.programming;

import java.util.Scanner;

public class ArmStrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input :");
		int a=sc.nextInt();
		
		for(int n=1;n<=a;n++)
		{
			int temp=n,count=0;
			for(;temp>0;temp/=10)count++;
			 temp=n;
			int total=0;
			while(temp>0)
			{
				int sum=1;
				int r=temp%10;
				for(int i=1;i<=count;i++)sum*=r;
				total+=sum;
				temp/=10;
			}
			if(n==total)System.out.println(n+" is ArmStrong");
		}

	}

}
