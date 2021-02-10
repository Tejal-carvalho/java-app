package com.techlab.collection;

public class LineItem {
	private int id;
	private String name;
	private double unitPrice;
	private int quantity;
	private double totalCartPrice;

	public LineItem(int id, String name, double unitPrice, int quantity) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getUnitPrice() {
		return unitPrice;

	}
	public int quantity() {
		return quantity;
	}

	public double calculateTotalCartPrice() {
		this.totalCartPrice=unitPrice*quantity+totalCartPrice;
		return totalCartPrice;
	}
	@Override
	public String toString() {
		return "\nid=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity
				+ ", totalCartPrice=" + totalCartPrice;
	}


}
