package com.micda.bankapisoap.endpoint;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(serviceName = "AccountService")
public class AccountService {

    @WebMethod
    public BigDecimal getBalance(@WebParam(name = "accountId") String accountId) {
        // Logique métier pour récupérer le solde du compte via l'ID du compte
        // Ici, on simule la réponse avec un solde statique
        BigDecimal balance = new BigDecimal("1500.50");
        System.out.println("Consultation du solde pour le compte : " + accountId);
        return balance;
    }
}
