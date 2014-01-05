package com.learn.guice.example4;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;

public class BillingModule implements Module {

	@Override
	public void configure(Binder binder) {
		// Class binding
		binder.bind(TransactionLog.class).to(DatabaseTransactionLog.class).in(Singleton.class);
		binder.bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
		
		// Or instance binding
		//binder.bind(CreditCardProcessor.class).toInstance(new PaypalCreditCardProcessor());
	}

}
