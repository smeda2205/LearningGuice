package com.learn.guice.example4;

public class PaypalCreditCardProcessor implements CreditCardProcessor {

	@Override
	public String getProcessorName() {
		return "PayPal Credit Card Processor!!";
	}

	

}
