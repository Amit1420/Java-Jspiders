package com.amit.matrixprogrampack;

import java.util.Scanner;

public class TransposeOfMatrix {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row :");
		int row=sc.nextInt();
		System.out.println("Enter the size of column :");
		int col=sc.nextInt();
		int[][] a=new int[row][col];
		System.out.println("Enter the elements of matrix :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
		

	}

}
