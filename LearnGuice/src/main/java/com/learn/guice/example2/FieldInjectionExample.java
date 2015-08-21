package com.learn.guice.example2;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class FieldInjectionExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		Greeter greeter = injector.getInstance(Greeter.class);
		greeter.sayHello();
	}
}
