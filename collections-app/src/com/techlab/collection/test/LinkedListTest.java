package com.techlab.collection.test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		// add elements
		list.add("one");
		list.add("two");
		// push
		list.push("three");
		list.push("four");
		list.push("four");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//set():To modify an element
		list.set(0, "zero");
		//remove(): To remove an element
		list.remove(1);
		// pop():pops an element from the stack represented by a list
		list.pop();
		System.out.println("After remove(1) and pop(): ");
		Iterator<String> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
