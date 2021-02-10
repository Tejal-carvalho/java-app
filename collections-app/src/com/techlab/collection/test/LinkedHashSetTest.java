package com.techlab.collection.test;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
	public static void main(String args[]) {
		LinkedHashSet<String> lset = new LinkedHashSet<String>();
		
		lset.add("two");
		lset.add("one");
		lset.add("three");
		lset.add("four");
		
	

		Iterator<String> itr = lset.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		lset.remove("two");
		System.out.println("After remove operation:");
		for (String element : lset) {
			System.out.println(element);

		}

	}

}
