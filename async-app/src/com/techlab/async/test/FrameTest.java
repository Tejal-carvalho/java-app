package com.techlab.async.test;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.techlab.async.Frame;
import com.techlab.async.HelloListener;
import com.techlab.async.PrintListener;

public class FrameTest {

	public static void main(String[] args) {
		JPanel panel=new JPanel();
		panel.setLayout(new FlowLayout());
		JButton button1=new JButton();
		button1.setText("hello");
		JButton button2=new JButton();
		button2.setText("print");
		panel.add(button1);
		panel.add(button2);
		Frame f=new Frame();
		f.add(panel);
		button1.addActionListener(new HelloListener());
		button2.addActionListener(new PrintListener());
	}

}
