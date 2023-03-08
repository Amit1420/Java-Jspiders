package com.amit.stringprogramspack;

import java.util.Scanner;

public class ChangeCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String s = sc.next();
		String temp = "";
		char ch2 = ' ';
		for (int i = 0; i < s.length(); i++) {
			char ch1 = s.charAt(i);
			if (ch1 >= 'A' && ch1 <= 'Z') {
				ch2 = (char) (ch1 + 32);
			} else if (ch1 >= 'a' && ch1 <= 'z') {
				ch2 = (char) (ch1 - 32);
			}
			temp = temp + ch2;
		}

		System.out.println(temp);

	}

}
