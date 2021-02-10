package com.techlab.test;

public class SplitDemoTest {

	public static void main(String[] args) {
		// split
		String name = "hello world@i am learning?java";
		String[] str = name.split("[@?]");
		System.out.println();
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}

	}

}
