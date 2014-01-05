package com.learn.guice.example4;

public class DatabaseTransactionLog implements TransactionLog {

	@Override
	public String type() {
		return "Database Transaction";
	}

}
