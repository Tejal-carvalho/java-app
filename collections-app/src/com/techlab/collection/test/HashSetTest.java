package com.techlab.collection.test;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		HashSet<String> hset = new HashSet<String>();
		// add elements
		
		hset.add("Two");
		hset.add("Three");
		hset.add("Four");
		hset.add("Five");
	    hset.add("One");
		Iterator<String> itr = hset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		hset.remove("One");
		System.out.println("After remove operation:");
		for (String element : hset) {
			System.out.println(element);

		}

	}

}
