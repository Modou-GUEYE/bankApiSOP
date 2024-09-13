package com.micda.bankapisoap.config;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.cxf.transport.servlet.CXFServlet;

@Configuration
public class SoapWebServiceConfig {

    @Bean
    public ServletRegistrationBean<CXFServlet> cxfServlet() {
        return new ServletRegistrationBean<>(new CXFServlet(), "/soap-api/*");
    }
}
