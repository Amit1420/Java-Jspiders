package com.amit.matrixprogrampack;
import java.util.Scanner;

public class SumOfDiagonals {

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
		int sum=0;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i][i];
			if(len%2!=0&&i==len/2) continue;
			sum=sum+a[i][len-1-i];
	
		}
		System.out.println("Sum Of diagonal of matrix : "+sum);
		
	}

}
