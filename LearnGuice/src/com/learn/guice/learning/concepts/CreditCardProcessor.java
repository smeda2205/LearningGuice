package com.learn.guice.learning.concepts;

import com.google.inject.ImplementedBy;

@ImplementedBy(PaypalCreditCardProcessor.class) //Provides default implementation, can be overriden by the bind() method in Guice's Configuration Module.
												// This is equivalent to defining 
												//			bind(CreditCardProcessor.class).to(PayPalCreditCardProcessor.class); in guice's configuration module.
public interface CreditCardProcessor {
	public String getProcessorName();
}
