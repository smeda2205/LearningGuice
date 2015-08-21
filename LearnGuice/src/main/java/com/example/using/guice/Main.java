package com.example.using.guice;

import com.example.without.guice.Customer;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

/**
 * Main Class for Execution
 * 
 * @author srimeda
 *
 */
public class Main {
	public static void main(String[] args) {
		Module module = new MyModule();
		Injector injector = Guice.createInjector(module);
		
		Customer customer = injector.getInstance(Customer.class);
		customer.changeSomething();
	}
}
