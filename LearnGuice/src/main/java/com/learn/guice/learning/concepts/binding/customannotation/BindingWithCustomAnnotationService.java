package com.learn.guice.learning.concepts.binding.customannotation;

import com.google.inject.Inject;
import com.learn.guice.learning.concepts.CreditCardProcessor;

public class BindingWithCustomAnnotationService {
	private CreditCardProcessor processor;
	
	@Inject
	public BindingWithCustomAnnotationService(@PayPal CreditCardProcessor processor){
		this.processor = processor;
	}
	
	public void display(){
		System.out.println("Binding With Custom Annotation -- Executing the transaction by the processor of type "
				+ processor.getProcessorName());
	}
}
