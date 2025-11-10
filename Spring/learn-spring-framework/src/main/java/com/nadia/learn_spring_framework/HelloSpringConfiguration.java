package com.nadia.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age, Address address) {}
// configuration Spring Beans
record Address(String street, String city) {}

record Person2(Person person, Address address) {}

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
        return new Person("Nadia", 33, new Address("123 Main St", "Springfield"));
    }
    @Bean(name = "address1")
    public Address address() {
           return new Address("123 Main St", "Springfield");
    }

    @Bean(name = "address2")
    public Address address2() {
        return new Address("456 Elm St", "Shelbyville");
    }

    @Bean
    public Person2 person2(Person person, Address address2) {
        return new Person2(person, address2);
    }

    @Bean
    public Person Person3MethodCall() {
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person4Parameters(String name, int age, Address address2) {
        return new Person(name, age, address2);
    }
}
     
    