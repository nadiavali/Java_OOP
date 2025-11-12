package com.nadia.DependencyInjectionPringLuncher;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import ch.qos.logback.core.model.processor.DependencyDefinition;

import java.util.Arrays;

// setter injection dependency Injection
@Component
class MyBussinessClass {

    Dependency1 dependency1;
    Dependency2 dependency2;

    
    @Autowired
    public void setDependency1(Dependency1 dependency1) {
        System.out.println("Setter Injection - setDependency1 called");
        this.dependency1 = dependency1;
    }
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        System.out.println("Setter Injection - setDependency2 called");
        this.dependency2 = dependency2;
    }
    public String toString() {
        return "Using " + dependency1 + " and " + dependency2;
    }
}
@Component  
class Dependency1 {
}       
@Component
class Dependency2 {
}

@Configuration
@ComponentScan // = @ComponentScan("com.nadia.gamingSpring")
public class DependenciesInjectionAppGamingSpring {
    public static void main(String[] args) {
        System.out.println("App Gaming Spring");
        var context = new AnnotationConfigApplicationContext(DependenciesInjectionAppGamingSpring.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

      
    }

}
