package com.amit.atmmachinedevelopment;

abstract public class Bank 
{
	abstract public  void amountWithdraw(int balance,int withdrawAmount);
	
	abstract public  void depositAmount(int balance,int amountDeposit);
	
	abstract public void balanceEnquiry(int balance);
	
	abstract public  void atmBalanceInfo(int balance,int withdrawAmount);
	

}
