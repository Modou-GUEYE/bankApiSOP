package com.micda.bankapisoap;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

@WebService(endpointInterface = "com.micda.bankapisoap.BankApiService")
@Service
public class BankApiServiceImpl implements BankApiService {

    @Override
    public BigDecimal getBalance(String accountId) {
        // Simulation d'une réponse
        return new BigDecimal("1000.00");
    }

    @Override
    public List<Transaction> getTransactions(String accountId, int pageNumber, int pageSize) {
        // Simulation d'une liste de transactions
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("T123", "2024-09-17T00:00:00", new BigDecimal("500.00"), "FCFA", "credit"));
        transactions.add(new Transaction("T124", "2024-09-17T01:00:00", new BigDecimal("200.00"), "FCFA", "debit"));
        return transactions;
    }

    @Override
    public TransferResponse transferFunds(String creditor, String debtor, BigDecimal amount, String currency) {
         //Simulation du transfert de fonds
        TransferResponse response = new TransferResponse();
        response.setStatus("Succès");
        response.setTransactionId("T125");
        response.setMessage("Transfert réussi");
        return response;
    }
}
