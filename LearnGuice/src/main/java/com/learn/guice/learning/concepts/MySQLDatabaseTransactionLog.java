package com.learn.guice.learning.concepts;

public class MySQLDatabaseTransactionLog extends DatabaseTransactionLog {
	
	@Override
	public String type() {
		return "MySQL Database Transaction";
	}
}
