package com.example.without.guice;

public class SendSMS implements Notifier {

	public void sendNotification(String to) {
		System.out.println("Send SMS");
	}

}
