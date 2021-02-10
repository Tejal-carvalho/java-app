package com.techlab.ocp.voilation.test;

import com.techlab.ocp.voilation.FestivalType;
import com.techlab.ocp.voilation.FixedDeposit;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit obj = new FixedDeposit(1, "abc", 10000, 20000, 5, FestivalType.DIWALI);
		printInfo(obj);

	}

	private static void printInfo(FixedDeposit obj) {
		System.out.println("Account number:" + obj.getAccNo());
		System.out.println("Account name:" + obj.getAccName());
		System.out.println("Amount:" + obj.getAmount());
		System.out.println("Principal amount:" + obj.getPrincipalAmount());
		System.out.println("Year:" + obj.getYears());
		System.out.println("Simple Interest is:" + obj.calculateSimpleInterest());

	}

}
