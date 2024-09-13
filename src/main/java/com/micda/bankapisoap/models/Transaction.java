package com.micda.bankapisoap.models;

import java.math.BigDecimal;

public class Transaction {
    private String transactionId;
    private String type;
    private BigDecimal amount;

    public Transaction(String transactionId, String type, BigDecimal amount) {
        this.transactionId = transactionId;
        this.type = type;
        this.amount = amount;
    }

    // Getters et Setters
    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
