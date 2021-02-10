package com.techlab.exception.test;

import com.techlab.custom.exception.CustomException;

public class ExceptionTest1 {
	public static void main(String args[]) {
		CustomException cs= new CustomException();
		System.out.println(cs);
		try {
		cs.validate(13);
		}catch(Exception e) {
			System.out.println("Exception occured: "+ e);
		}
		System.out.println("rest of the code");
		
	}

}
