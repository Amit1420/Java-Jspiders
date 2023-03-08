package com.amit.searchingpack;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array :");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the elements of array :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element which is to be searched :");
		int ele=sc.nextInt();
		int index=search(a,ele);
		if(index==-1)
		{
			System.out.println("Element not found");
		}
		else
		{
			System.out.println("Element found in index="+index);
		}
		

	}
	public static int search(int[] a,int ele)
	{
		for(int i=0;i<a.length;i++)
		{
			if(ele==a[i]) return i;
		}
		return -1;
	}

}
