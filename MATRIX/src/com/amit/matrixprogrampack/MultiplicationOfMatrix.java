package com.amit.matrixprogrampack;

import java.util.Scanner;

public class MultiplicationOfMatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of row of matrix1:");
		int row1=sc.nextInt();
		System.out.println("Enter the size of column of matrix1 :");
		int col1=sc.nextInt();
		int[][] a=new int[row1][col1];
		System.out.println("Enter the elements of matrix1 :");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the size of row of matrix2:");
		int row2=sc.nextInt();
		System.out.println("Enter the size of column of matrix2 :");
		int col2=sc.nextInt();
		int[][] b=new int[row2][col2];
		System.out.println("Enter the elements of matrix2 :");
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int[row1][col2];
		if(col1==row2)
		{
		multiply(a, b, c);
		display(c);
		}
		else
		{
			System.out.println("we cannot perform multiplication of that two matrix");
			System.out.println("Because colsize of matrix1 is "+col1+" and rowsize of matrix2 is "+row2+" are different");
		}
		

	}
	public static void multiply(int[][] a, int[][] b, int[][] c)
	{
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		
	}
	public static void display(int[][] a)
	{
		for(int[] temp:a)
		{
			for(int n:temp)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
	
}
