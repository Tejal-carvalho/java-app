package com.techlab.frame.test;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listerner3 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		String str = e.getActionCommand();
		System.out.println(str);
		
	}

}
