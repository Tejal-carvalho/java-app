package com.techlab.account;

public class SavingAccount extends Account{
	public SavingAccount(int accno, String accname, double balance) {
		super(accno, accname, balance);
	}

	public void withdraw(double amount) {
		if(super.getBalance()-amount<super.getSavingMinBal()) {
			System.out.println("withdraw is not possible from saving account ");
		}
		else {
			   double bal=super.getBalance()-super.getWithdraw_amount();
			   super.setBalance(bal);
		}
		
	}


}
