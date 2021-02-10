package com.techlab.account;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AccountTest {


	@Test
	void testAccount() {
		
			//arrange
			int expectedaccno = 101;
			String expectedaccname = "abc";
			double expectedbalance = 15000;
			//act
			Account ac=new Account(101,"abc",15000);
			//assert
			assertEquals(expectedaccno,ac.getAccountNumber());
			assertEquals(expectedaccname ,ac.getName());
			assertEquals(expectedbalance,ac.getBalance());
	}

	@Test
	void testWithdraw() {
		//Arrange
		double expectedbalance = 1500;
		//Act
		Account ac=new Account(101,"abc",1500);
		ac.withdraw(1200);
		//assert
		assertEquals(expectedbalance,ac.getBalance());
		
	}

	@Test
	void testDeposit() {
		//Arrange
		double expectedbalance = 2000;
		//Act
		Account ac=new Account(101,"abc",1500);
		ac.deposit(500);
		//assert
		System.out.println(ac.getBalance());
		assertEquals(expectedbalance,ac.getBalance());
				
	}

}
