package com.techlab.async;

import java.time.LocalDateTime;

public class MyThread implements Runnable{

	@Override
	public void run() {
		while(true) {
		LocalDateTime current = LocalDateTime.now();
		System.out.println(current);
		}
		
	}

	
}
