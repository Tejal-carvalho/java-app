package com.techlab.collection.test;

import java.util.ArrayList;

import com.techlab.collection.LineItem;

public class LineItemTest {

	public static void main(String[] args) {
		ArrayList<LineItem> cart = new ArrayList<LineItem>();
		cart.add(new LineItem(1,"abc",20,10));
		cart.add(new LineItem(2,"pqr",10,5));
		cart.add(new LineItem(3,"xyz",20,20));
		printCartItem(cart);
	}

	private static void printCartItem(ArrayList<LineItem> cart) {
		double sum=0;
		for (int i = 0; i < cart.size(); i++) {
			LineItem item=cart.get(i);
		    sum=sum+item.calculateTotalCartPrice();
			System.out.println(cart.get(i));
		}
		System.out.println("Total Cost:"+sum);

		
	}

}
