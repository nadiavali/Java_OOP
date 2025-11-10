package com.nadia.learn_spring_framework;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// --- domain records ---
record Person(String name, int age, Address address) {}
record Address(String street, String city) {}
record Person2(Person person, Address address) {}

@Configuration
public class HelloSpringConfiguration {

    // --- simple values ---
    @Bean("fullName")
    public String fullName() { return "Nadia"; }

    @Bean("age")
    public int age() { return 33; }

    // --- addresses (multiple beans of same type) ---
    @Bean("addressPrimary")
    @Primary
    public Address addressPrimary() {
        return new Address("789 Oak St", "Capital City");
    }

    @Bean("addressSpringfield")
    public Address addressSpringfield() {
        return new Address("123 Main St", "Springfield");
    }

    @Bean("addressShelbyville")
    public Address addressShelbyville() {
        return new Address("456 Elm St", "Shelbyville");
    }

    // --- persons (showing @Primary & @Qualifier usage) ---

    // Default Person → uses the PRIMARY Address unless overridden
    @Bean("personDefault")
    @Primary
    public Person personDefault(@Qualifier("fullName") String name,
                                @Qualifier("age") int age,
                                Address address /* primary is injected */) {
        return new Person(name, age, address);
    }

    // Person specifically with Shelbyville address
    @Bean("personShelbyville")
    public Person personShelbyville(@Qualifier("fullName") String name,
                                    @Qualifier("age") int age,
                                    @Qualifier("addressShelbyville") Address address) {
        return new Person(name, age, address);
    }

    // Person specifically with Springfield address
    @Bean("personSpringfield")
    public Person personSpringfield(@Qualifier("fullName") String name,
                                    @Qualifier("age") int age,
                                    @Qualifier("addressSpringfield") Address address) {
        return new Person(name, age, address);
    }

    // Composite bean showing mixed injection (explicit qualifiers)
    @Bean
    public Person2 person2(@Qualifier("personShelbyville") Person person,
                           @Qualifier("addressSpringfield") Address address) {
        return new Person2(person, address);
    }
}
