package com.amit.bankloan;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your Loan Amount");
   	    double loanAmount=sc.nextInt();
		Salesman s=new Salesman();
		
		s.salesForLoan(new SBI(),loanAmount);
		
		
	}

}
