package com.learn.guice.learning.concepts;

import com.google.inject.ProvidedBy;
import com.learn.guice.learning.concepts.providers.DatabaseTransactionLogProvider;

@ProvidedBy(DatabaseTransactionLogProvider.class)	// This is equivalent to defining the provider 
													// 			bind(TransactionLog.class).toProvider(DatabaseTransactionLogProvider.class); in Guice's Configuration Module.
public interface TransactionLog {
	public String type();
}
