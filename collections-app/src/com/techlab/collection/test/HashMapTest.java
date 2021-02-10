package com.techlab.collection.test;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(4, "four");
		hm.put(2, "two");
		hm.put(3, "three");
		hm.put(1, "one");

		System.out.println("List of elements:" +hm);
		
		hm.putIfAbsent(4, "four");
		hm.replace(2, "Twice");
		
		hm.remove(3);
		System.out.println("List of elements:" +hm);

	}

}
