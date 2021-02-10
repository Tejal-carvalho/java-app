  package com.techlab.customer;

import java.util.ArrayList;

public class Order {
	private int orderid;
	private String orderdate;
	private ArrayList<Product> product;
	
	public Order(int orderid,String orderdate,ArrayList<Product> product) {
		this.orderid=orderid;
		this.orderdate=orderdate;
		this.product=product;
		
	}
	public int getOrderId() {
		return orderid;
	}
	
	public String getOderDate() {
		return orderdate;
	}
	public ArrayList<Product> getAllProducts() {
		return product;
	}
	
	public void addProduct(Product p) {
		product.add(p);
	}
	public void removeProduct(Product p) {
		product.remove(p);
	}
	public int getProductCount() {
		return product.size();
	}

}
