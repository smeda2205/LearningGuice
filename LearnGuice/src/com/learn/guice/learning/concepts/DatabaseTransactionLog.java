package com.learn.guice.learning.concepts;

public class DatabaseTransactionLog implements TransactionLog {

	private String jdbcUrl;
	private int threadPoolSize;

	@Override
	public String type() {
		return "Database Transaction";
	}

	public String getJdbcUrl() {
		return jdbcUrl;
	}

	public void setJdbcUrl(String jdbcUrl) {
		this.jdbcUrl = jdbcUrl;
	}

	public int getThreadPoolSize() {
		return threadPoolSize;
	}

	public void setThreadPoolSize(int poolSize) {
		this.threadPoolSize = poolSize;
	}

}
