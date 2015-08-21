package com.example.without.guice;

import com.google.inject.Inject;

public class Customer {
	
	//Field Injection
	@Inject
	private Notifier notifier;

	//Constructor Injection
	/*@Inject
	public Customer(Notifier notifier){
		this.notifier = notifier;
	}*/
	
	public Notifier getNotifier() {
		return notifier;
	}

	//Setter Injection
	//@Inject
	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void changeSomething() {
		this.notifier.sendNotification("This Customer");
	}
}
