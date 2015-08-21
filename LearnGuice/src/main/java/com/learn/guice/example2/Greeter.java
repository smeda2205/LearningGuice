package com.learn.guice.example2;

import com.google.inject.Inject;

public class Greeter {
	@Inject Displayer displayer;
	
	void sayHello() {
		displayer.display("Hello, World!!");
	}
}
