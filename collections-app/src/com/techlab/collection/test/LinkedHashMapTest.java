package com.techlab.collection.test;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lm = new LinkedHashMap<Integer, String>();
	
		lm.put(4, "four");
		lm.put(2, "two");
		lm.put(3, "three");
		lm.put(1, "one");
		
		System.out.println("Element of value:" + lm);
		lm.replace(3, "THREE");

		lm.remove(2);
		System.out.println("Element of value:" + lm);

	}

}
