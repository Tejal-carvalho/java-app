package com.techlab.frame.test;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.techlab.frame.WelcomeFrame2;

public class WelcomeFrameTest2 {

	public static void main(String[] args) {
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JButton button=new JButton();
		button.setText("hello");
		panel.add(button);
		WelcomeFrame2 frame=new WelcomeFrame2();
		button.addActionListener(new Listerner1());
		button.addActionListener(new Listerner2());
		frame.add(panel);
	}
	
}
