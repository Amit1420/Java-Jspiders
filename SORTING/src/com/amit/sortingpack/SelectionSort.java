package com.amit.sortingpack;

import java.util.Scanner;

public class SelectionSort {

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
		selectionsort(a);
		System.out.println("The elements of an array after sorting : ");
		for (int n : a) {
			System.out.print(n + " ");
		}

	}

	public static void selectionsort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[index])
					index=j;
			}
			if (i != index) {
				int temp = a[index];
				a[index] = a[i];
				a[i] = temp;
			}
		}
	}
	
}
