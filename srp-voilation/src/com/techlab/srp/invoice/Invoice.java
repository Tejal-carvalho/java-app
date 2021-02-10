package com.techlab.srp.invoice;

public class Invoice {
	private int no;
	private String desc;
	private double cost;
	private double discount;
	private static final float gst=12.5f;
	public Invoice(int no,String desc,double cost,double discount) {
		this.no=no;
		this.desc=desc;
		this.cost=cost;
		this.discount=discount;
	}
	public int getNo() {
		return no;
	}

	public String getDesc() {
		return desc;
	}
	public double getCost() {
		return cost;
	}
	public double getDiscount() {
		return discount;
	}
	public static float getGst() {
		return gst;
	}
	public double calculateDiscount() {
		double discountRs=cost*discount/100;
		return discountRs;
	}
	public double calculateTax() {
		double tax=(cost-this.calculateDiscount())*gst/100;
		return tax;
	}
	public double calculateFinalCost() {
		double finalcost=(cost-this.calculateDiscount()+this.calculateTax());
		return finalcost;
	}
	public void printInfo(Invoice obj) {
		System.out.println("Invoice number:"+this.getNo());
		System.out.println("Invoice description:"+this.getDesc());
		System.out.println("Cost:"+this.getCost());
		System.out.println("Discount:"+this.getDiscount());
		System.out.println("Discount rs is:"+this.getDiscount());
		System.out.println("Tax is:"+this.calculateTax());
		System.out.println("Final cost is:"+this.calculateFinalCost());
		
	}
}
