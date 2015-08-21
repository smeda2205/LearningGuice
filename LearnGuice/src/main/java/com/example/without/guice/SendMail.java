package com.example.without.guice;

public class SendMail implements Notifier {

	public void sendNotification(String to) {
		System.out.println("Send Mail");
	}

}
