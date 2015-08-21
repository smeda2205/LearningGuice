package com.learn.guice.learning.concepts;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.name.Names;
import com.learn.guice.learning.concepts.binding.customannotation.PayPal;
import com.learn.guice.learning.concepts.providers.DatabaseTransactionLogProvider;

public class BillingModule implements Module {

	public void configure(Binder binder) {
		/**
		 *  1. Class binding
		 */
//		binder.bind(TransactionLog.class).to(DatabaseTransactionLog.class).in(Singleton.class); // Commented to explain linked binding in example #3
//		binder.bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
		
		/**
		 *  2. instance binding
		 */
		//binder.bind(CreditCardProcessor.class).toInstance(new PaypalCreditCardProcessor()); //Commented to avoid errors as the same is binding using class bindin in example #1
		
		/**
		 * 3. Linked Binding
		 * 
		 * Link DatabaseTransactionLog to subclass MySQLDatabaseTransactionLog. You can chain this
		 * linking.
		 * 
		 * Injector will return instance of MySQLDatabaseTransactionLog.
		 * 
		 */
//		binder.bind(TransactionLog.class).to(DatabaseTransactionLog.class); // -- commented it to explain @Provides Example below #6
		binder.bind(DatabaseTransactionLog.class).to(MySQLDatabaseTransactionLog.class);
		
		binder.bind(CreditCardProcessor.class).to(PaypalCreditCardProcessor.class);
		
		/**
		 *  4. Binding Annotation @Named
		 */
		binder.bind(CreditCardProcessor.class).annotatedWith(Names.named("PayPal")).to(PaypalCreditCardProcessor.class);
		
		/**
		 *  5. Binding using Custom Annotation (Here, I created a custom annotation called @PayPal)
		 */
		//binder.bind(CreditCardProcessor.class).annotatedWith(PayPal.class).to(PaypalCreditCardProcessor.class); // Commented to explain @Provides with custom @PayPal annotation below #7
		
		/**
		 *  8. Explains the usage of Provider, instead of using the @Provides
		 */
		binder.bind(TransactionLog.class).toProvider(DatabaseTransactionLogProvider.class);
		
	}


	/**
	 *  6. @Provides
	 *  
	 *  - We use @Provides when we need code to create an object.
	 *  - The method must be defined within a module, and it must have an @Provides annotation.
	 *  - The method's return type is the bound type.
	 *  - Whenever the injector needs an instance of that type, it will invoke the method.
	 *  
	 */
	
	/*@Provides
	TransactionLog provideTransactionLog(){
		DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();
		transactionLog.setJdbcUrl("jdbc:mysql://localhost/pizza");
	    transactionLog.setThreadPoolSize(30);
	    return transactionLog;
	}*/ // -- Commented to explain the usage of the Provider defined in example #8
	
	/**
	 *  7. @Provides with binding custom annotation OR with binding annotation
	 *  
	 *  - If the @Provides method has a binding annotation like @PayPal or @Named("Checkout"), Guice binds the annotated type.
	 *  - Dependencies can be passed in as parameters to the method. 
	 *  - The injector will exercise the bindings for each of these before invoking the method.
	 */
	@Provides @PayPal
	CreditCardProcessor providePaypalCreditCardProcessor(){
		PaypalCreditCardProcessor paypalCreditCardProcessor = new PaypalCreditCardProcessor();
		paypalCreditCardProcessor.setProcessorName("PayPal Credit Card Processor!!");
	    return paypalCreditCardProcessor;
	}
	
}
