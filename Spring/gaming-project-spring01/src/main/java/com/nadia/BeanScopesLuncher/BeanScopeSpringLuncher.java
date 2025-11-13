package com.nadia.BeanScopesLuncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

import java.util.Arrays;


@Component
class NormalClass {
    public NormalClass() {
      
    }
}
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass {
    
}



@Configuration
@ComponentScan // = @ComponentScan("com.nadia.gamingSpring")
public class BeanScopeSpringLuncher {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(BeanScopeSpringLuncher.class);

        // Singleton scope - default scope // same instance every time
        System.out.println("NormalClass bean retrieval:"+ context.getBean(NormalClass.class));
        System.out.println("NormalClass bean retrieval:"+ context.getBean(NormalClass.class));

        // Prototype scope - new instance every time
        System.out.println("PrototypeClass1 bean retrieval:"+ context.getBean(PrototypeClass.class));
        System.out.println("PrototypeClass2 bean retrieval:"+ context.getBean(PrototypeClass.class));
        System.out.println("PrototypeClass3 bean retrieval:"+ context.getBean(PrototypeClass.class));
       
        
        context.close();
    }

}
