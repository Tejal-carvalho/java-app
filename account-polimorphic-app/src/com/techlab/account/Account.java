package com.techlab.account;

abstract public class Account {
	private int accno;
	private String accname;
	private double balance;
	final private double deposit_amount=500;
	final private double withdraw_amount=300;
	final private double current_min_bal=500;
	final private double saving_min_bal=1000;
	
	Account(int accno,String accname,double balance){
		this.accno=accno;
		this.accname=accname;
		this.balance=balance;
	}
	
	public int getId() {
		return accno;
	}
	public String getAccname() {
		return accname;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance=balance;
	}
	public double getDeposit_amount() {
		return deposit_amount;
	}
	public double getWithdraw_amount() {
		return withdraw_amount;
	}
	public double getCurrentMinBal() {
		return current_min_bal;
	}
	public double getSavingMinBal() {
		return saving_min_bal;
	}

	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	abstract public void withdraw(double amount);

}
