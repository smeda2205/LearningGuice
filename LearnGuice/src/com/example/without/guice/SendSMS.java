package com.example.without.guice;

public class SendSMS implements Notifier {

	@Override
	public void sendNotification(String to) {
		System.out.println("Send SMS");
	}

}
