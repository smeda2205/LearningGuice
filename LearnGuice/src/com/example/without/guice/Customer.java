package com.example.without.guice;

public class Customer {
	private Notifier notifier;

	public Notifier getNotifier() {
		return notifier;
	}

	public void setNotifier(Notifier notifier) {
		this.notifier = notifier;
	}
	
	public void changeSomething() {
		this.notifier.sendNotification("This Customer");
	}
}
