package com.amit.atmmachine;

public class Utility 
{
	static int atmBalance=5000;
	
	public static void amountWithdraw(int balance,int withdrawAmount)
	{
		int availableBalance=balance-withdrawAmount;
		System.out.println("Available balance : "+availableBalance);
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
	public static void atmBalanceInfo(int balance,int withdrawAmount)
	{
	    if(atmBalance<withdrawAmount) System.out.println("Out of Cash");
	    else amountWithdraw( balance,withdrawAmount);
	}


}
