package com.techlab.customer;

public class Product {
	private int pid;
	private String pname;
	private double cost;
	private float discountpercentage;

	public Product(int pid, String pname, double cost, float discountpercentage) {
		this.pid = pid;
		this.pname = pname;
		this.cost = cost;
		this.discountpercentage = discountpercentage;

	}

	public int getProductId() {
		return pid;
	}

	public String getProductName() {
		return pname;
	}

	public double getCost() {
		return cost;
	}

	public float getDiscount() {
		return discountpercentage;
	}

	public double calculateTotalCost() {
		return cost - (cost * discountpercentage / 100);
	}

}
