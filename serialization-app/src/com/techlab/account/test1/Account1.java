package com.techlab.account.test1;

import java.io.Serializable;

public class Account1 implements Serializable{
	private static int autoaccno = 1;
	private int accno;
	
	private String accName;
	private double balance;
	private final int minbal=500;
	private final double deposit_amount=500;
	private final double withdraw_amount=1100;
	private boolean transationflag=true;

	public Account1(String accName, double balance) {
		this.accName = accName;
		this.balance = balance;
		accno = autoaccno++;
	}
	@Override
	public String toString() {
		return "Account1 [accno=" + accno + ", accName=" + accName + ", balance=" + balance + "]";
	}


	public int getAccNo() {
		return accno;
	}

	public String getAccName() {
		return accName;
	}

	public double getBalance() {
		return balance;
	}
	public int getMinbal() {
		return minbal;
	}
	public double getDeposit_amount() {
		return deposit_amount;
	}
	public boolean getTransationFlag() {
		return transationflag;
	}
	public double getWithdraw_amount() {
		return withdraw_amount;
	}

	public void deposit(double amount) {
		this.balance = balance + amount;

	}

	public void withdraw(double amount) {
		if( (balance - amount)<minbal) {
			transationflag=false;
			
		}
		else {
			this.balance = balance - amount;
			transationflag=true;

		}
}

}
