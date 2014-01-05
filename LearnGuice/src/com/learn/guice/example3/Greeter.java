package com.learn.guice.example3;

import com.google.inject.Inject;

public class Greeter {
	Displayer displayer;

	/**
	 * This is Method Injection.
	 * 
	 * The name of the method need not to be setDisplayer(). It can be anything.
	 * It can also take multiple parameters.
	 * 
	 * @param displayer
	 */
	@Inject	void setDisplayer(Displayer displayer) {
		this.displayer = displayer;
	}

	void sayHello() {
		displayer.display("Hello, World!!");
	}
}
