package com.nadia.PostAnnotationContextLuncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import java.util.Arrays;



@Component
class PostClassA {
    private SomeDependency someDependency;

    public PostClassA(SomeDependency someDependency) {
        super();
        this.someDependency = someDependency;
        System.out.println("All dependencies for PostClassB initialized");
    }

    // method to be executed after the bean is constructed and dependencies are injected
    // this method will be called only once in the bean lifecycle
    // PostConstruct is used to perform any initialization after dependency injection is done
    // to fetch data from a database or to perform any setup required before the bean is used
    @PostConstruct
    public void initialize() {
        someDependency.getReady();
    }

    // method to be executed before the bean is destroyed
    // PreDestroy is used to perform any cleanup before the bean is removed from the context
    // this method will be called only once in the bean lifecycle
    // PreDestroy is not called for prototype scoped beans
    // because the container does not manage the complete lifecycle of a prototype bean
    // that means the container creates the bean and hands it over to the client
    // the client is responsible for cleaning up the prototype bean
    // hence, PreDestroy method is not called for prototype beans to avoid confusion it is better to avoid using PreDestroy with prototype beans
    @PreDestroy
    public void cleanup() {
        System.out.println("PostClassA is being destroyed");
    }
}

@Component
class SomeDependency {

    public void getReady() {
        System.out.println("SomeDependency is ready to use");
    }
    
}




@Configuration
@ComponentScan // = @ComponentScan("com.nadia.gamingSpring")
public class PostAnnotationSpringLuncher {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(PostAnnotationSpringLuncher.class);

       
       
        
        context.close();
    }

}
