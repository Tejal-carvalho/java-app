package com.techlab.collection.test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		TreeSet<String> tset=new TreeSet<String>();
		tset.add("One");
		tset.add("Two");
		tset.add("Three");
		tset.add("Four");
		tset.add("Five");
		Iterator<String> itr=tset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		//get highest value and remove that
		System.out.println("Highest value:"+tset.pollFirst());
		
		//get lowest value and remove that
		System.out.println("Lowest value:"+tset.pollLast());
		
		tset.remove("Two");
		System.out.println("After remove operation:");
		tset.remove("Two");
		for (String element : tset) {
			System.out.println(element);
			
		}

	}

}
