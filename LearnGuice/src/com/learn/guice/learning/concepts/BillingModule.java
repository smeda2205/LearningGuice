package com.learn.guice.learning.concepts;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Singleton;
import com.google.inject.name.Names;
import com.learn.guice.learning.concepts.binding.customannotation.PayPal;

public class BillingModule implements Module {

	@Override
	public void configure(Binder binder) {
		// 1. Class binding
//		binder.bind(TransactionLog.class).to(DatabaseTransactionLog.class).in(Singleton.class);
//		binder.bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
		
		// 2. instance binding
		//binder.bind(CreditCardProcessor.class).toInstance(new PaypalCreditCardProcessor());
		
		/**
		 * 3. Linked Binding
		 * 
		 * Link DatabaseTransactionLog to subclass MySQLDatabaseTransactionLog. You can chain this
		 * linking.
		 * 
		 * Injector will return instance of MySQLDatabaseTransactionLog.
		 * 
		 */
		binder.bind(TransactionLog.class).to(DatabaseTransactionLog.class);
		binder.bind(DatabaseTransactionLog.class).to(MySQLDatabaseTransactionLog.class);
		
		binder.bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
		
		// 4. Binding Annotation @Named
		binder.bind(CreditCardProcessor.class).annotatedWith(Names.named("PayPal")).to(PaypalCreditCardProcessor.class);
		
		// 5. Binding using Custom Annotation (Here, I created a custom annotation called @PayPal)
		binder.bind(CreditCardProcessor.class).annotatedWith(PayPal.class).to(PaypalCreditCardProcessor.class);
	}

}
