package com.nadia.LazyInitialization;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;


@Component
class ClassA {}

@Component
@Lazy // this bean will be created only when it is requested for the first time meaning lazy initialization // try that by removing @Lazy and see the difference in output

class ClassB {
    private ClassA classA;

    public ClassB(ClassA classA) {
        this.classA = classA;
        System.out.println("ClassB initialized");
    }
    public String toString() {
        return "Using " + classA;
    }
}


@Configuration
@ComponentScan // = @ComponentScan("com.nadia.gamingSpring")
public class LayzInitializationSpringLuncher {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(LayzInitializationSpringLuncher.class);
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        System.out.println("Context initialized"); // at this point, ClassB bean is not created yet due to @Lazy annotation
        context.getBean(ClassB.class); // requesting ClassB bean for the first time
        System.out.println(context.getBean(ClassB.class).toString());
        
        context.close();
    }

}
