package com.nadia.ConstructorInjectionSpringLuncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
 

import java.util.Arrays;

// constructor injection
// is recommended way of dependency injection when compared to field injection and setter injection
// advantages: immutability, easier to test, and clearly indicates required dependencies
// no need to have @Autowired annotation on constructor if there is only one constructor
// note: if there are multiple constructors, then we need to specify @Autowired on one of them
// spring will use that constructor to do the dependency injection very simply
// if there is only one constructor, spring will use that constructor even without @Autowired annotation

@Component
class MyBussinessClass {

    Dependency1 dependency1;
    Dependency2 dependency2;

    
    @Autowired // not mandatory for constructor injection to have @Autowired annotation
    public MyBussinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - MyBussinessClass called");
        this.dependency1 = dependency1;
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
        System.out.println(context.getBean(MyBussinessClass.class));

      
    }

}
