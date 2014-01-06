package com.learn.guice.learning.concepts.providers;

import com.google.inject.Provider;
import com.learn.guice.learning.concepts.DatabaseTransactionLog;
import com.learn.guice.learning.concepts.TransactionLog;

public class DatabaseTransactionLogProvider implements Provider<TransactionLog> {

	@Override
	public TransactionLog get() {
		DatabaseTransactionLog transactionLog = new DatabaseTransactionLog();

		transactionLog.setJdbcUrl("sample JDBC URL");
		transactionLog.setThreadPoolSize(10);

		return transactionLog;
	}

}
