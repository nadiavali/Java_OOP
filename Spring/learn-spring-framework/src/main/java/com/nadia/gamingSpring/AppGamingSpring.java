package com.nadia.gamingSpring;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nadia.gaming.GameRunner;

import com.nadia.gaming.MarioGame;
import com.nadia.gaming.PacMan;

public class AppGamingSpring {
    public static void main(String[] args) {
        System.out.println("App Gaming Spring");
        var context = new AnnotationConfigApplicationContext(GamingSpringConfiguration.class);
        
        //context.getBean(GameRunner.class).run();
        context.getBean(MarioGame.class).up();
       //context.getBean(GameRunner.class).run();
       context.getBean("MarioGameRunner", GameRunner.class).run();
       context.getBean("PacManGameRunner", GameRunner.class).run();
    //    System.out.println("\nGaming Beans in the Context:");
    //    for (String beanName : context.getBeanDefinitionNames()) {
    //        System.out.println(beanName);
    //    }
        context.close();
       }

    
       

      
    }


