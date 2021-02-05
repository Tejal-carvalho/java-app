package com.techlab.async;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.time.LocalDateTime;

public class PrintListener implements ActionListener{


	@Override
	public void actionPerformed(ActionEvent e) {
			MyThread mobj=new MyThread();
			Thread t1=new Thread(mobj);
			t1.start();
	}

}
