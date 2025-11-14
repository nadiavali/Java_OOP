package com.nadia.learn_spring_boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest controller to expose an endpoint to retrieve currency service configuration
@RestController
public class CuConfController {
    

    @Autowired // to get the bean managed by spring container
    public CurrencyServiceConfiguration Config;

    @RequestMapping("/currency-configuration") // <-- hit http://localhost:8080/currency-configuration
    public CurrencyServiceConfiguration retrieveCurrencyConfiguration() {
        return Config ;
    }
}
