package com.example.without.guice;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer();
		Notifier notifier = new SendMail();
		customer.setNotifier(notifier);
		customer.changeSomething();
	}
}
