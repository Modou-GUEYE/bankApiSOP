package com.micda.bankapisoap;

import javax.jws.WebMethod;
import javax.jws.WebService;

import java.math.BigDecimal;
import java.util.List;

@WebService

public interface BankApiService {

    @WebMethod
    BigDecimal getBalance(String accountId);

    @WebMethod
    List<Transaction> getTransactions(String accountId, int pageNumber, int pageSize);

    @WebMethod
    TransferResponse transferFunds(String creditor, String debtor, BigDecimal amount, String currency);
    
    
}
