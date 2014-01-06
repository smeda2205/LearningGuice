package com.learn.guice.learning.concepts;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.learn.guice.learning.concepts.binding.customannotation.BindingWithCustomAnnotationService;

public class Client {
	public static void main(String[] args) {
		Module module = new BillingModule();
		Injector injector = Guice.createInjector(module);
		
		/**
		 * Now that we have got the injector, we can build objects
		 */
		RealBillingService billingService = injector.getInstance(RealBillingService.class);
		billingService.execute();
		
		/**
		 * Explains the usage of Binding Annotation @Named
		 */
		BindingAnnotationService bindingAnnotationService = injector.getInstance(BindingAnnotationService.class);
		bindingAnnotationService.process();
		
		/**
		 * Explains Binding with Custom Annotation
		 */
		BindingWithCustomAnnotationService bindingWithCustomAnnotationService = injector.getInstance(BindingWithCustomAnnotationService.class);
		bindingWithCustomAnnotationService.display();
	}
}
