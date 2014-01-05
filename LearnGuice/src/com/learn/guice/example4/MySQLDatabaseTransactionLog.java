package com.learn.guice.example4;

public class MySQLDatabaseTransactionLog extends DatabaseTransactionLog {
	
	@Override
	public String type() {
		return "MySQL Database Transaction";
	}
}
