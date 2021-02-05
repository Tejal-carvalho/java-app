package com.techlab.assignment.test;

public class ArrayTest {

	public static void main(String[] args) {
		int arr[] = { 4, 6, 5, -10, 8, 5, 20 };
		for (int i : arr) {
			// System.out.println(i);
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++)
				if (arr[i] + arr[j] == 10)
					System.out.println(arr[i] + "+" + arr[j]);
			// System.out.println("first no:"+arr[i]+"second no:"+arr[j]);
		}

	}
}