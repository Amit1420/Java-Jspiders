package com.amit.oopsprogramming;

import java.util.Scanner;

class Sum {
	int sum = 0;

	public int sum(int num) {
		while (num > 0) {
			int rem = num % 10;
			sum = sum + rem;
			num /= 10;

		}
		return sum;
	}

}

class ReverseNumber extends Sum {
	int rev = 0;

	public int reverseNumber() {
		while (sum > 0) {
			int rem = sum % 10;
			rev = rev * 10 + rem;
			sum /= 10;
		}
		return rev;
	}

}

class Multiply extends ReverseNumber {
	int res = 0;

	public int multiply(int num) {
		int sum = sum(num);

		int rev = reverseNumber();

		res = sum * rev;

		return res;
	}
}

public class SpecialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number : ");
		int num = sc.nextInt();
		Multiply m = new Multiply();
		if (m.multiply(num) == num)
			System.out.println("Special Number");
		else
			System.out.println("Not Special Number");

	}

}
