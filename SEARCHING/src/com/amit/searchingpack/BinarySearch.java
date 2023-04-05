package com.amit.searchingpack;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

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
	    Arrays.sort(a);
	    System.out.println("Elements of array after sorting :");
		for(int n:a)
		{
			System.out.print(n+" ");
		}
		System.out.println();
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
		int start=0,end=a.length-1;
		while(start<=end)
		{
		int mid=(start+end)/2;
		if(ele==a[mid]) return mid;
		else if(ele<a[mid]) end=mid-1;
		else start=mid+1;
		}
		return -1;
	}
                     //     using recursion
//	public static int binarySearch(int[] a, int ele, int start, int end) {
//		if(start > end) return -1;
//		int mid = (start + end)/2;
//		if(ele == a[mid]) return mid;
//		else if(ele < a[mid]) return binarySearch(a, ele, start, mid-1);
//		else return binarySearch(a, ele, mid+1, end);
//		
//	}
}
	

