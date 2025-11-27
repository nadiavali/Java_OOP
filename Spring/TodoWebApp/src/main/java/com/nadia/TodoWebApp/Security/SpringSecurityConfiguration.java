package com.nadia.TodoWebApp.Security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class SpringSecurityConfiguration {
    // LDAP or Database
    // in memory
    //InMemoryUserDetailsManager
    //InMemoryUserDetailsManager(UserDetails...users)

    @Bean
    public InMemoryUserDetailsManager createUserDetailsManager() {
        UserDetails userDetails =
        User.withDefaultPasswordEncoder().username("Nadia").password("123").roles("USER", "ADMIN").build();

        return new InMemoryUserDetailsManager(userDetails);
    }
    
}
