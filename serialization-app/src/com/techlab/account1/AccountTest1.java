package com.techlab.account1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.techlab.account.test1.Account1;

public class AccountTest1 {

	public static void main(String[] args) {
		Account1 a1 = new Account1("ac", 700);
		Account1 a2 = new Account1("abc", 8000);
		printInfo(a1);
		System.out.println("Deposit:" + a1.getDeposit_amount());
		a1.deposit(a1.getDeposit_amount());
		printInfo(a1);
		System.out.println("Withdraw:" + a1.getWithdraw_amount());
		a1.withdraw(a1.getWithdraw_amount());
		printInfo(a1);
		storingIntoFile(a1);
		retriveAccountDetails(a1);
		storingIntoFile(a2);
		retriveAccountDetails(a2);
	}

	private static void printInfo(Account1 a) {
		if (!a.getTransationFlag()) {
			System.out.println("not sufficient balance");
			System.out.println("Available balance:" + a.getBalance());
		} else {
			System.out.println("Available balance:" + a.getBalance());
		}

	}

	private static void storingIntoFile(Account1 a) {
		try {
			FileOutputStream fout = new FileOutputStream(
					"D:\\Java\\Assignment\\Serialization-app\\src\\AccountDetails.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(a);
			out.flush();
			out.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static Account1 retriveAccountDetails(Account1 retriveAccount) {
		try {
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("D:\\Java\\Assignment\\Serialization-app\\src\\AccountDetails.txt"));
			retriveAccount = (Account1) in.readObject();
			System.out.println(retriveAccount.toString());
			in.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return retriveAccount;
	}


}
