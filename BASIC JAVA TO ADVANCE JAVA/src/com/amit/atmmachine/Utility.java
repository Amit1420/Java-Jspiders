package com.amit.atmmachine;

public class Utility 
{
	
	public static int amountWithdraw(int balance,int withdrawAmount)
	{
		int availableBalance=balance-withdrawAmount;
		return availableBalance;
	}
	public static int depositAmount(int balance,int amountDeposit)
	{
		int availableBalance=balance+amountDeposit;
		return availableBalance;
	}
	public static void balanceEnquiry(int balance)
	{
		System.out.println("Available Balance :"+balance);
	}


}
