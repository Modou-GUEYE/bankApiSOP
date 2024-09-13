package com.micda.bankapisoap.endpoint;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import com.micda.bankapisoap.models.Transaction;

@WebService(serviceName = "TransactionService")
public class TransactionService {

    @WebMethod
    public List<Transaction> getTransactions(
        @WebParam(name = "accountId") String accountId,
        @WebParam(name = "pageNumber") int pageNumber,
        @WebParam(name = "pageSize") int pageSize) {

        // Logique pour récupérer les transactions paginées
        // Simulation de données pour l'historique des transactions
        List<Transaction> transactions = getAllTransactions(accountId);
        int start = (pageNumber - 1) * pageSize;
        int end = Math.min(start + pageSize, transactions.size());

        if (start > transactions.size()) {
            return new ArrayList<>(); // Retourne une liste vide si la page dépasse le nombre de transactions
        }

        System.out.println("Historique des transactions pour le compte : " + accountId);
        return transactions.subList(start, end);
    }

    private List<Transaction> getAllTransactions(String accountId) {
        // Simule la récupération de toutes les transactions pour un compte
        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("TXN001", "debit", new BigDecimal("100.00")));
        transactions.add(new Transaction("TXN002", "credit", new BigDecimal("200.00")));
        transactions.add(new Transaction("TXN003", "debit", new BigDecimal("50.00")));
        return transactions;
    }
}
