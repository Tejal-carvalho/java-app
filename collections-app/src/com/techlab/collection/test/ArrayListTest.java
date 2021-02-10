package com.techlab.collection.test;

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();// generic
		// add element
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("one");
		// size() : give length of list
		// get() : to access an element
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		// set():to modify an element
		list.set(0, "updated");
		System.out.println("After updating 0th element:" + list.get(0));
		// remove(): to remove element
		list.remove(1);
		System.out.println("After updatation:");
	    for (String element : list) {
	    	System.out.println(element);
			
		}
		
	

	}

}
