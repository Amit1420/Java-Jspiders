package com.amit.stringprogramspack;

import java.util.Scanner;

public class Pangram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your String:");
		String s = sc.nextLine();
		System.out.println(checkPangram(s)); 

	}
	static boolean checkPangram(String str) {
		boolean[] mark = new boolean[26];

		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';
			else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')
				index = str.charAt(i) - 'a';
			mark[index] = true;
		}
		for (int i = 0; i <= 25; i++)
			if (!mark[i])
				return false;
		return true;
	}

}
