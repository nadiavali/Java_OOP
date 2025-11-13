package com.nadia.XMLConfigSpringLuncher;


import java.util.Arrays;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nadia.gaming.GameRunner;

public class XMLConfigSpringLuncher {
    public static void main(String[] args) {
        System.out.println("Hello Spring Framework!");
        var context = 
           new ClassPathXmlApplicationContext("ContextConfiguration.xml");
      
           System.out.println(context.getBean("name"));
           System.out.println(context.getBean("age"));
                Arrays.stream(context.getBeanDefinitionNames())
           .forEach(System.out::println);
           context.getBean(GameRunner.class).run();

      
        context.close();
    }
}
