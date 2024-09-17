package com.micda.bankapisoap;

import javax.xml.ws.Endpoint;

public class BankApiPublisher {

    public static void main(String[] args) {
    	
        // URL où le service SOAP sera publié
        String url = "http://localhost:8080/bankapisoap";
        System.out.println("Publication de BankApiService sur " + url);
        
        // Publication du service
        //Endpoint.publish(url, new BankApiServiceImpl());
        
        System.out.println("Service publié avec succès!");
    }
}
