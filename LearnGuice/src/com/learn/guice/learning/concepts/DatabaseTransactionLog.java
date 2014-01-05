package com.learn.guice.learning.concepts;

public class DatabaseTransactionLog implements TransactionLog {

	@Override
	public String type() {
		return "Database Transaction";
	}

}
