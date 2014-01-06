package com.learn.guice.learning.concepts;

public class PaypalCreditCardProcessor implements CreditCardProcessor {

	private String processorName;

	public void setProcessorName(String processorName) {
		this.processorName = processorName;
	}

	@Override
	public String getProcessorName() {
		return processorName; // "PayPal Credit Card Processor!!";
	}

}
