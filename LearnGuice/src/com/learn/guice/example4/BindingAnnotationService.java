package com.learn.guice.example4;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class BindingAnnotationService {
	private CreditCardProcessor processor;

	@Inject
	BindingAnnotationService(@Named("PayPal") CreditCardProcessor processor) {
		this.processor = processor;
	}

	public void process() {
		System.out
				.println("Executing the transaction by the processor of type "
						+ processor.getProcessorName());
	}
}
