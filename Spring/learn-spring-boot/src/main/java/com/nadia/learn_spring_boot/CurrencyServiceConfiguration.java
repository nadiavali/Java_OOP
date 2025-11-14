package com.nadia.learn_spring_boot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

//currency-service.url=
//currency-service.username=
//currency-service.password=


// @ConfigurationProperties to map properties with prefix "currency-service" to this class fields
//  combination of @ConfigurationProperties and profiles allow us to have different configurations for different environments
// @Component to make it a bean managed by spring container
// so that it can be @Autowired in other classes
@ConfigurationProperties(prefix = "currency-service")
@Component // to make it a bean managed by spring container
public class CurrencyServiceConfiguration {
    private String url;
    private String username;
    private String password;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
