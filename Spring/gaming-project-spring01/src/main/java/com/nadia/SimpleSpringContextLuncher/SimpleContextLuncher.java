package com.nadia.SimpleSpringContextLuncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

// field injection
@Component
class MyBussinessClass {

   @Autowired // as soon as we put @Autowired, spring will search for a bean of type Dependency1 and inject it here(field injection)
    Dependency1 dependency1;

    @Autowired
    Dependency2 dependency2;

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
public class SimpleContextLuncher {
    public static void main(String[] args) {
        System.out.println("App Gaming Spring");
        var context = new AnnotationConfigApplicationContext(SimpleContextLuncher.class);
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

        System.out.println(context.getBean(MyBussinessClass.class));
        
        context.close();
    }

}
