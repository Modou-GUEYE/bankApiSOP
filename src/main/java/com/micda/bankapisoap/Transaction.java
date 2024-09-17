package com.micda.bankapisoap;

import java.math.BigDecimal;

public class Transaction {
	private String transactionId;
    private String date;
    private BigDecimal amount;
    private String currency;
    private String type;

    public Transaction(String transactionId, String date, BigDecimal amount, String currency, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.currency = currency;
        this.type = type;
    }

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    
}
