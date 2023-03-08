package com.amit.sortingpack;

public class InsertionSort {

	public static void main(String[] args) {
		int[] a= {4,7,1,3,8,2,9};
		insertionSort(a);
		for(int n:a)
		{
			System.out.println(n);
		}

	}
	public static void insertionSort(int[] a)
	{
		for(int i=1;i<a.length-1;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>-1&&a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}

}
