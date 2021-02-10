package com.techlab.account;

public class Account {
	private int accno;
	private String name;
	protected double balance;

	public Account(int accno, String name, double balance) {
		this.accno = accno;
		this.name = name;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accno;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(int amount) {
		if ((balance - amount) >= 500) {
			balance = balance - amount;
		}
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}

}
