package com.techlab.customer.test;

import java.util.ArrayList;

import com.techlab.customer.Customer;
import com.techlab.customer.Order;
import com.techlab.customer.Product;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		ArrayList<Order> orderlist = new ArrayList<Order>();
		Product p1 = new Product(10, "abc", 4000, 10f);
		Product p2 = new Product(11, "pqr", 600, 5f);
		products.add(p1);
		products.add(p2);
		Order order = new Order(111, "20-march-2020", products);
		orderlist.add(order);
		Customer cust = new Customer(101, "john", orderlist);
		//printInfo(cust);
		Order ordertwo = new Order(117, "25-april-2020", products);
		cust.addOrders(ordertwo);
		printInfo(cust);

	}

	private static void printInfo(Customer cust) {
		System.out.println("customer id:" + cust.getCustId());
		System.out.println("customer name:" + cust.getCustName());
		System.out.println("Order count:" + cust.getOrderCount());
		ArrayList<Order> orders = cust.getAllOrders();
		for (Order order : orders) {
			int totalCost = 0;
			System.out.println("orderid:" + order.getOrderId() + " orderdate:" + order.getOderDate()
					+ " Total products:" + order.getProductCount());
			ArrayList<Product> products = order.getAllProducts();
			System.out.println("ID\tName\tcost\tDiscount finalcost");
			for (Product product : products) {
				System.out.println(product.getProductId() + "\t" + product.getProductName() + "\t" + product.getCost()
						+ "\t" + product.getDiscount() + "\t" + product.calculateTotalCost());
				totalCost += product.calculateTotalCost();

			}
			System.out.println("total cost:" + totalCost);
		}
		

	}

}
