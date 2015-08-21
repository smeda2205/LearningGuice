package com.learn.guice.learning.concepts;

import com.google.inject.Inject;
import com.learn.guice.learning.concepts.binding.customannotation.PayPal;

public class ProvidesWithCustomAnnotationExample {
private CreditCardProcessor processor;
	
	@Inject
	public ProvidesWithCustomAnnotationExample(@PayPal CreditCardProcessor processor){
		this.processor = processor;
	}
	
	public void display(){
		System.out.println("Using @Provides and Binding With Custom Annotation -- Executing the transaction by the processor of type "
				+ processor.getProcessorName());
	}
}
