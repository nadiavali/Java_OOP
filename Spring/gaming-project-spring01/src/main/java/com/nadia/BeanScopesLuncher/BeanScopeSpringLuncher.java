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

// Singleton scope - default scope
// same instance every time
// no need to specify @Scope annotation for singleton scope
// using it here for demonstration

@Component
class NormalClass {
    public NormalClass() {
      
    }
}

// Prototype scope - new instance every time
// Possible scopes: singleton, prototype, request, session, application
// request, session, application scopes are used in web applications
// request - one instance per HTTP request
// session - one instance per HTTP session
// application - one instance per ServletContext
// To use request, session, application scopes, we need to use @Scope with WebApplicationContext constants
// e.g. @Scope(value=WebApplicationContext.SCOPE_REQUEST)
// here we are using prototype scope for demonstration
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
