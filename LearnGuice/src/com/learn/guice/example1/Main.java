package com.learn.guice.example1;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
	public static void main(String[] args) {
		Injector injector = Guice.createInjector();
		Greeter greeter = injector.getInstance(Greeter.class);
		greeter.sayHello();

	}
}
