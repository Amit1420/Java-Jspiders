package com.amit.matrixprogrampack;

import java.util.Scanner;

public class SpiralPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size :");
		int size=sc.nextInt();
		int[][] a=spiral(size);
		for(int[] temp:a)
		{
			for(int n:temp)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		

	}
	public static int[][] spiral(int size)
	{
		char m='r';
		int r=0,c=-1;
		int[][] a=new int[size][size];
		for(int i=1;i<=size*size;i++)
		{
			switch(m)
			{
				case 'r' :	c++;
				            a[r][c]=i;
				            if(c==size-1 ||a[r][c+1]!=0) m='d';
				            break;
				case 'd' :	r++;
	            			a[r][c]=i;
	            			if(r==size-1 ||a[r+1][c]!=0) m='l';
	            			break;
				case 'l' :	c--;
	            			a[r][c]=i;
	            			if(c==0||a[r][c-1]!=0) m='u';	
	            			break;
				case 'u' :	r--;
							a[r][c]=i;
							if(a[r-1][c]!=0) m='r';	
				break;
				
			}
		}
		return a;
	}

}
