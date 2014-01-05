package com.learn.guice.learning.concepts;

public class PaypalCreditCardProcessor implements CreditCardProcessor {

	@Override
	public String getProcessorName() {
		return "PayPal Credit Card Processor!!";
	}

	

}
