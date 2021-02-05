package com.techlab.account.test;

import com.techlab.account.Account;
import com.techlab.account.CurrentAccount;
import com.techlab.account.SavingAccount;

public class AccountTest {
	public static void main(String args[]) {
		CurrentAccount c = new CurrentAccount(1, "abc", 500);
		SavingAccount s = new SavingAccount(2, "xyz", 600);
		c.deposit(c.getDeposit_amount());
		s.deposit(s.getDeposit_amount());
		System.out.println("Balance of Current account after deposit:");
		printInfo(c);
		System.out.println("Balance of Saving account after deposit:");
		printInfo(s);
		c.withdraw(c.getWithdraw_amount());
		s.withdraw(s.getWithdraw_amount());
		System.out.println("Balance After withdrawal from Current account:");
		printInfo(c);
		System.out.println("Balance After withdrawal from Saving account:");
		printInfo(s);
	}

	private static void printInfo(Account obj) {
		System.out.println((obj.getBalance()));

	}

}
