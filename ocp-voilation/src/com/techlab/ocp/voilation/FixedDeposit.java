package com.techlab.ocp.voilation;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principalAmount;
	private int years;
	private float rate;
	private FestivalType festName;

	public FixedDeposit(int accNo, String accName, double amount, double principalAmount, int years,
			FestivalType festName) {
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

	public double calculateSimpleInterest() {
		if (this.festName.equals(FestivalType.DIWALI)) {
			rate = 10f;
		} else if (this.festName.equals(FestivalType.HOLI)) {
			rate = 10f;
		} else if (this.festName.equals(FestivalType.NORMAL)) {
			rate = 5f;
		}
		double simpleInterest = (double) principalAmount * years * rate / 100;
		return simpleInterest;
	}

}
