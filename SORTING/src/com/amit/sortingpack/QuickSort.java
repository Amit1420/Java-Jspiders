package com.amit.sortingpack;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an array :");
		int s = sc.nextInt();
		int[] a = new int[s];
		System.out.println("Enter the elements of an array :");
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("The elements of an array before sorting : ");
		for (int n : a) {
			System.out.print(n + " ");
		}
		System.out.println();
		sort(a,0,a.length-1);
		System.out.println("The elements of an array after sorting : ");
		for (int n : a) {
			System.out.print(n + " ");
		}

	}
	static void sort(int[] a,int start,int end )
	{
		if(start>=end) return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(i<=j)
		{
			while(a[i]<pivot) i++;
			while(a[j]>pivot)j--;
			if(i<=j)
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}

}
