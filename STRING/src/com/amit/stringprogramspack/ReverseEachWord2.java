package com.amit.stringprogramspack;

import java.util.Scanner;

public class ReverseEachWord2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.nextLine();
		char[] a = s.toCharArray();
		int i = 0, j = 0;
		String res = "";
		while (i < a.length) {
			while (i < a.length && a[i] != ' ')
				i++;
			int k = i - 1;
			String temp = "";
			while (k >= j) {
				temp = temp + a[k];
				k--;
			}
			res = res + temp;
			if (i < a.length)
				res = res + " ";
			i++;
			j = i;
		}
		System.out.println(res);
	}

}
