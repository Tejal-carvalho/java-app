package com.techlab.ocp.solution;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principalAmount;
	private int years;
	private IFestivalRate festName;

	public FixedDeposit(int accNo, String accName, double amount, double principalAmount, int years,
			IFestivalRate festName) {
		this.accNo = accNo;
		this.accName = accName;
		this.amount = amount;
		this.principalAmount = principalAmount;
		this.years = years;
		this.festName = festName;
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getPrincipalAmount() {
		return principalAmount;
	}

	public double getAmount() {
		return amount;
	}

	public int getYears() {
		return years;
	}

	public IFestivalRate getFestival() {
		return festName;
	}

	public double calculateSimpleInterest() {
		double simpleInterest = (double)principalAmount * years * festName.getRate() / 100;;
		return simpleInterest;
	}

}
