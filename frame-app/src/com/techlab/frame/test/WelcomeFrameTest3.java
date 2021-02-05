package com.techlab.frame.test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.techlab.frame.WelcomeFrame2;

public class WelcomeFrameTest3 {

	public static void main(String[] args) {
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JButton button=new JButton();
		button.setText("hello");
		panel.add(button);
		JButton button1=new JButton();
		button1.setText("exit");
		panel.add(button1);
		WelcomeFrame2 frame=new WelcomeFrame2();
		button.addActionListener(new Listerner3());
		button1.addActionListener(new Listerner3());
		frame.add(panel);
	}

}
