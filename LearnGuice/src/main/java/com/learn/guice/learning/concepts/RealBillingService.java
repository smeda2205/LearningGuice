package com.learn.guice.learning.concepts;

import com.google.inject.Inject;

public class RealBillingService {

	private CreditCardProcessor processor;
	private TransactionLog transactionLog;

	@Inject
	RealBillingService(CreditCardProcessor processor,
			TransactionLog transactionLog) {
		this.processor = processor;
		this.transactionLog = transactionLog;
	}

	public void execute() {
		System.out.println("Executing the transaction of type "
				+ transactionLog.type() + " using "
				+ processor.getProcessorName());
	}
}
