package com.nadia.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {}
// configuration Spring Beans
record Address(String street, String city) {}
@Configuration
public class HelloSpringConfiguration {
    
    @Bean
    public String name() {
        return "Nadia";
    }
    @Bean
    public int age() {
        return 33;
    }
    @Bean
    public Person person( ) {
        return new Person("Nadia", 33);
    }
    @Bean
    public Address address() {
           return new Address("123 Main St", "Springfield");
    }

}
     
    