package com.example.using.guice;

import com.example.without.guice.Notifier;
import com.example.without.guice.SendSMS;
import com.google.inject.Binder;
import com.google.inject.Module;

public class MyModule implements Module{

	@Override
	public void configure(Binder binder) {
		binder.bind(Notifier.class).to(SendSMS.class);
	}

}
