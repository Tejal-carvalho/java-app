package com.techlab.ocp.solution.test;

import com.techlab.ocp.solution.DiwaliRate;
import com.techlab.ocp.solution.FixedDeposit;
import com.techlab.ocp.solution.HoliRate;
import com.techlab.ocp.solution.IFestivalRate;
import com.techlab.ocp.solution.NormalRate;

public class FixedDepositTest {

	public static void main(String[] args) {
		IFestivalRate iobj = new DiwaliRate();
		IFestivalRate holi = new HoliRate();
		IFestivalRate normal = new NormalRate();
		FixedDeposit obj = new FixedDeposit(1, "abc", 10000, 20000, 5, iobj );
		printInfo(obj);
	}

	private static void printInfo(FixedDeposit obj) {
		System.out.println("Account number:" + obj.getAccNo());
		System.out.println("Account name:" + obj.getAccName());
		System.out.println("Amount:" + obj.getAmount());
		System.out.println("Principal amount:" + obj.getPrincipalAmount());
		System.out.println("Year:" + obj.getYears());
		System.out.println("Festival name is:" + obj.getFestival());
		System.out.println("Simple Interest is:" + obj.calculateSimpleInterest());
	}

}
