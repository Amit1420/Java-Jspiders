package com.amit.programspack;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter A Number :");
		int num=s.nextInt();
		int i=1;
		while(i<=10)
		{
			System.out.println(num+" * "+i+"="+(num*i));
			i++;
		}

	}

}
