package com.test.rest.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RestConfig extends ResourceConfig{

    @Autowired
    public RestConfig() {
        packages("com.test.rest.resource");
    }
}
