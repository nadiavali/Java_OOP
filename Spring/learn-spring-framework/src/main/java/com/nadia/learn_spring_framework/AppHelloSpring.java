package com.nadia.learn_spring_framework;

import java.text.Annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloSpring {
    public static void main(String[] args) {
        System.out.println("Hello Spring Framework!");

        // Launch a Spring Context -
        var context = new AnnotationConfigApplicationContext(HelloSpringConfiguration.class);
        //Configure and launch the Spring Application Context
        // HelloSpringConfiguration @Configuration
        // name @Bean
        //Retrieve a bean from the Spring Context
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address1"));
        //retrieve by type
        //System.out.println(context.getBean(Address.class));
        //System.out.println(context.getBean(Person2.class));
        //System.out.println(context.getBean("Person3MethodCall"));
        System.out.println(context.getBean("person4Parameters"));

    }
}
