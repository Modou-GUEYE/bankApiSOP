package com.micda.bankapisoap.endpoint;

import java.math.BigDecimal;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "TransferService")
public class TransferService {

    @WebMethod
    public String transferFunds(
        @WebParam(name = "creditor") String creditor,
        @WebParam(name = "debtor") String debtor,
        @WebParam(name = "amount") BigDecimal amount,
        @WebParam(name = "currency") String currency) {

        // Logique métier pour effectuer un virement
        System.out.println("Virement de " + amount + " " + currency + " du compte " + debtor + " vers le compte " + creditor);

        // Simulation de la réussite du virement
        return "Virement effectué avec succès";
    }
}
