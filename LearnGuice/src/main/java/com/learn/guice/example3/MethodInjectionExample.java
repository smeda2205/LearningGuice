package com.learn.guice.example3;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.learn.guice.example3.Greeter;

public class MethodInjectionExample {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		Greeter greeter = injector.getInstance(Greeter.class);
		greeter.sayHello();
	}
}
