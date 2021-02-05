package com.techlab.sync;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDateTime;

public class PrintListener implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent e) {
		while(true) {
			LocalDateTime current = LocalDateTime.now();
			System.out.println(current);
		}
		
	}

}
