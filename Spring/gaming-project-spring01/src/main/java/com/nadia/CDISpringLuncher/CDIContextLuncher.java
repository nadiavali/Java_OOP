package com.nadia.CDISpringLuncher;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.inject.Inject;
import jakarta.inject.Named;

//@Component
@Named //instead of @Component
class BusinessService {
    DataService dataService;


    public DataService getDataService() {
       return dataService;
    }
    //@Autowired // avoid null
    @Inject // instead of @Autowired
    public void setDataService(DataService dataService) {
         System.out.println("Setter injection will be performed");
         this.dataService = dataService;
    }
}

//@Component
@Named //instead of @Component
class DataService {
    public DataService() {
    }
}

@Configuration
@ComponentScan 
public class CDIContextLuncher {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(CDIContextLuncher.class);
        //System.out.println(context.getBean(BusinessService.class).getDataService());
        
       
        
        context.close();
    }

}
