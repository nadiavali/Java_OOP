package com.nadia.gamingSpring;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


import com.nadia.gaming.MarioGame;
import com.nadia.gaming.GameRunner;

@Configuration
@ComponentScan("com.nadia.gaming")
public class AppGamingSpring {
    public static void main(String[] args) {
        System.out.println("App Gaming Spring");
        var context = new AnnotationConfigApplicationContext(AppGamingSpring.class);
     
        context.getBean(MarioGame.class).up();
        System.out.println("This is game runner primary Mario");
        System.out.println("....................................");
        context.getBean("gameRunner", GameRunner.class).run();
        
        context.close();
       }
      
    }


