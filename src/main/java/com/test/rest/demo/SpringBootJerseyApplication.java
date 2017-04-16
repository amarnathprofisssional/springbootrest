package com.test.rest.demo;

import com.test.rest.config.RestConfig;
import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * Created by amar on 4/15/2017.
 */
@SpringBootApplication
public class SpringBootJerseyApplication {
    public static void main(String args[]){
        SpringApplication.run(SpringBootJerseyApplication.class, args);
    }

    @Bean
    public ServletRegistrationBean jerseyServlet() {
        ServletRegistrationBean registration = new ServletRegistrationBean(new ServletContainer(), "/rest/*");
        // our rest resources will be available in the path /rest/*
        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, RestConfig.class.getName());
        return registration;
    }
}
