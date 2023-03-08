package com.amit.stringprogramspack;

import java.util.Scanner;

public class ReverseWord2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		int i = a.length - 1, j = a.length - 1;
		String res = "";
		while (i >= 0) {
			while (i >= 0 && a[i] != ' ')
				i--;
			int k = i + 1;
			String temp = "";
			while (k <= j) {
				temp = temp + a[k];
				k++;
			}
			res = res + temp;
			if (i >= 0)
				res = res + " ";
			i--;
			j = i;
		}
		System.out.println(res);
	}

}
