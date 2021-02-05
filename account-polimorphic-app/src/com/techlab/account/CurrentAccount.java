package com.techlab.account;

public class CurrentAccount extends Account {

	public CurrentAccount(int accno, String accname, double balance) {
		super(accno, accname, balance);
	}

	public void withdraw(double amount) {
		if(super.getBalance()-amount<super.getCurrentMinBal()) {
			System.out.println("withdraw is not possible");
		}
		else {
			   double bal=super.getBalance()-super.getWithdraw_amount();
		       super.setBalance(bal);
		}
		
		
	}

}
