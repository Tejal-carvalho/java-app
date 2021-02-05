package com.techlab.assignment.test;

public class ArrayDuplicateTest {

	public static void main(String[] args) {
		int arr[]= {4, 3, 2, 4, 9, 2};
		int m=arr.length;
		 for (int i = 0; i < m-1; i++) 
		 {
			 for(int j=i+1;j<m ;j++)
			 {
				 if(arr[i]==arr[j])
				 {
					 arr[j]=arr[m-1];
					 m--;
					 j--;
				 }
			 }
		 }
		for(int i = 0; i < m; i++)
			System.out.print(" "+arr[i]);

	}

}
