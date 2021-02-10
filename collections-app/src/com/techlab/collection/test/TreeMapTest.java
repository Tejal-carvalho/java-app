package com.techlab.collection.test;

import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(4, "four");
		tm.put(2, "two");
		tm.put(3, "three");
		tm.put(1, "one");
		System.out.println("Element of list" + tm);
		tm.replace(1, "ONE");
		tm.remove(2);
		System.out.println("Element of list" + tm);
	}

}
