package com.techlab.assignment.test;

public class SubstringTest {

	public static void main(String[] args) {
		String name = "https://www.Google.com@java?xyz";
		System.out.println("Using substring:");
		System.out.println("Company name:" + name.substring(12,19));
		System.out.println("Language:" + name.substring(28, 32));
		System.out.println("Intern:" + name.substring(33));
        System.out.println("Using split:");
		// String name = "hello world@i am learning?java";
		String[] str = name.split("[.@?]");
		System.out.println("Company name:" + str[1]);
		System.out.println("Language:" + str[3]);
		System.out.println("Intern:" + str[4]);

	}
}
