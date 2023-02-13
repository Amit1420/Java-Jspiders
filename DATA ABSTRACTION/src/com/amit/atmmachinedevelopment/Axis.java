package com.amit.atmmachinedevelopment;

public class Axis extends Bank
{
	int atmBalance=100000;
	@Override
	public  void amountWithdraw(int balance,int withdrawAmount)
	{
		int availableBalance=balance-withdrawAmount;
		System.out.println("Available balance : "+availableBalance);
	}
	
	@Override
	public  void depositAmount(int balance,int amountDeposit)
	{
		int availableBalance=balance+amountDeposit;
		System.out.println("Available Balance :"+availableBalance);
	}
	
	@Override
	public  void balanceEnquiry(int balance)
	{
		System.out.println("Available Balance :"+balance);
	}
	@Override
	public void atmBalanceInfo(int balance,int withdrawAmount)
	{
	    if(atmBalance<withdrawAmount) System.out.println("Out of Cash");
	    else amountWithdraw( balance,withdrawAmount);
	}
}
