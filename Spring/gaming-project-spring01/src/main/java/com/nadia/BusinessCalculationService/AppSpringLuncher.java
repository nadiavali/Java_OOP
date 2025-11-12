package com.nadia.BusinessCalculationService;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppSpringLuncher {

   

    public static void main(String[] args) {
        System.out.println("Business Calculation Service - Spring");
        var context = new AnnotationConfigApplicationContext(AppSpringLuncher.class);
        System.out.println(context.getBean(BusinessCalculationService.class).findMaximum());
    };

    
}
