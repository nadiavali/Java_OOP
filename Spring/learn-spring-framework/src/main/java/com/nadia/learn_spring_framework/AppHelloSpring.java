package com.nadia.learn_spring_framework;
import java.util.Arrays;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloSpring {
    public static void main(String[] args) {
        System.out.println("Hello Spring Framework!");

        // Launch a Spring Context -

        try {
            var context = 
            new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);

        //Configure and launch the Spring Application Context
        // HelloSpringConfiguration @Configuration
        // name @Bean
        //Retrieve a bean from the Spring Context
              // 2 Retrieve beans by type
        Person person = context.getBean(Person.class);
        System.out.println("Default person (uses @Primary): " + person);

        Address address = context.getBean(Address.class);
        System.out.println("Default address (uses @Primary): " + address);

        // 3️ Retrieve beans by name (when there are multiple of same type)
        Person personSpringfield = (Person) context.getBean("personSpringfield");
        System.out.println("Springfield person: " + personSpringfield);

        Person personShelbyville = (Person) context.getBean("personShelbyville");
        System.out.println("Shelbyville person: " + personShelbyville);

        Address addressSpringfield = (Address) context.getBean("addressSpringfield");
        System.out.println("Springfield address: " + addressSpringfield);

        Address addressShelbyville = (Address) context.getBean("addressShelbyville");
        System.out.println("Shelbyville address: " + addressShelbyville);

        // 4 Retrieve the composite bean
        Person2 person2 = context.getBean(Person2.class);
        System.out.println("Person2 composite: " + person2);

        // 5 List all beans (for debugging / inspection)
        System.out.println("\nBeans registered in context:");
        for (String name : context.getBeanDefinitionNames()) {
            System.out.println(" - " + name);
        }

        // 6 Close context (clean shutdown)
         context.close();
      
        // Arrays.stream(context.getBeanDefinitionNames())
        //     .forEach(System.out::println);

        } catch (Exception e) {
            // TODO: handle exception

        }

    }
}
