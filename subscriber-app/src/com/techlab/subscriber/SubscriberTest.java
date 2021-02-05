package com.techlab.subscriber;

import com.techlab.publisher.Account;

public class SubscriberTest {

	public static void main(String[] args) {
		Account a=new Account(1,"qwe",1000);
		a.addNotifier(new WhatsAppNotification());
		a.deposit(1000);

	}

}
