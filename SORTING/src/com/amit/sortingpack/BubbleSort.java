package com.amit.sortingpack;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter size of an array :");
	int s=sc.nextInt();
	int[] a=new int[s];
	System.out.println("Enter the elements of an array :");
	for(int i=0;i<a.length;i++)
	{
	      a[i]=sc.nextInt();
	}
	System.out.println("The elements of an array before sorting : ");
	for(int n:a) 
	{
		System.out.print(n+" ");
	}
	bubblesort(a);
	System.out.println();
	System.out.println("The elements of an array after sorting : ");
	for(int n:a) 
	{
		System.out.print(n+" ");
	}

	}
	public static void bubblesort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1-i;j++ )
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}

}
