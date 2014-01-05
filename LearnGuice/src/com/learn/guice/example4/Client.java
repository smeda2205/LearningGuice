package com.learn.guice.example4;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

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
	}
}
