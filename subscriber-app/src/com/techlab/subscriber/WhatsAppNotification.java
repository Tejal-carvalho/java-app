package com.techlab.subscriber;

import com.techlab.publisher.Account;
import com.techlab.publisher.INotifier;

public class WhatsAppNotification implements INotifier{

	@Override
	public void notifymsg(Account a) {
		System.out.println("Whats app notification send as updated bal:"+a.getBalance());
		
	}

}
