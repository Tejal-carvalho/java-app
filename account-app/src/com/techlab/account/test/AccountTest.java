package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.InsufficientBalanceException;

public class AccountTest {

	public static void main(String[] args) {
		Account a1 = new Account("ac", 700);
		printInfo(a1);
		System.out.println("Deposit:"+a1.getDeposit_amount());
		a1.deposit(a1.getDeposit_amount());
		printInfo(a1);
		try {
			System.out.println("Withdraw:"+a1.getWithdraw_amount());
			a1.withdraw(a1.getWithdraw_amount());
			printInfo(a1);
		} catch (Exception e) {
			System.out.println("Not sufficient balance " + e);
		}
	}

	private static void printInfo(Account a) {
		System.out.println("Available balance:" + a.getBalance());

	}
  //without try catch:
	/*private static void printInfo(Account a) {
		if(!a.getTransationFlag()) {
			System.out.println("not sufficient balance");
			System.out.println("Available balance:" + a.getBalance());
		}
		System.out.println("Available balance:" + a.getBalance());

	}*/
	
}
