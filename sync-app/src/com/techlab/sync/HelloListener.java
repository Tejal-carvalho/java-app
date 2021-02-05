package com.techlab.sync;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;

public class HelloListener implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent ae) {
		JDialog d=new JDialog();
		d.setSize(100, 100);
		d.setVisible(true);
	}

}
