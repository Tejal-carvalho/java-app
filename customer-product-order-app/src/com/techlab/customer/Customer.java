package com.techlab.customer;

import java.util.ArrayList;

public class Customer {
	private int custid;
	private String custname;
	private ArrayList<Order> order;
	
	public Customer(int custid,String custname,ArrayList<Order> order) {
		this.custid=custid;
		this.custname=custname;
		this.order=order;
	}
	public int getCustId() {
		return custid;
	}
	public String getCustName() {
		return custname;
	}
	public ArrayList<Order> getAllOrders(){
		return order;
	}
	public void addOrders(Order o) {
		order.add(o);	
	}
	
	public int getOrderCount() {
		return order.size();
	}

}
