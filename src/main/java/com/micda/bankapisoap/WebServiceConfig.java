package com.micda.bankapisoap;

import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.cxf.transport.servlet.CXFServlet;

import javax.xml.ws.Endpoint;

@Configuration
public class WebServiceConfig {

    @Bean
    public ServletRegistrationBean<CXFServlet> cxfServlet() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/soap-api/*");
    }

    @Bean(name = Bus.DEFAULT_BUS_ID)
    public Bus springBus() {
        return new org.apache.cxf.bus.spring.SpringBus();
    }

    @Bean
    public Endpoint endpoint(Bus bus, BankApiServiceImpl bankApiServiceImpl) {
        EndpointImpl endpoint = new EndpointImpl(bus, bankApiServiceImpl);
        endpoint.publish("/BankApiService");
        return endpoint;
    }
}

