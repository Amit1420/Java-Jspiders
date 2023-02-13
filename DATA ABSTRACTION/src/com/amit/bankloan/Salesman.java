package com.amit.bankloan;

public class Salesman
{
     public void salesForLoan(Bank bank,Double loanAmount)
     { 
    	 double roi=bank.rateOfInterest();
    	 double roiInDouble=roi*100;
    	 int roiInInt=(int) roiInDouble; 
    	 System.out.println(roiInInt+"% is the rate of interest "+" charged by "+bank.getClass().getSimpleName()+" bank");
    	 
    	 double interestCharged=loanAmount*roiInInt;
    	 System.out.println(interestCharged+" is the rate of interest charged"+
    	 " for the amount "+loanAmount+" by "+bank.getClass().getSimpleName()+" bank");
    	 
    	 double totalAmount=loanAmount+interestCharged;
    	 System.out.println(totalAmount+" is the total amount to be paid for "+
    	 bank.getClass().getSimpleName()+"for the amount "+loanAmount);
    	 
     }
     
}
