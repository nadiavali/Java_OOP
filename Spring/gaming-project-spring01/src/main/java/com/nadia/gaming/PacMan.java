package com.nadia.gaming;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier
public class PacMan implements GamingConsole {
    public void up() {
        System.out.println("PacMan goes UP");
    }
    public void down() {
        System.out.println("PacMan goes DOWN");
    }
    public void left() {
        System.out.println("PacMan goes LEFT");
    }

    public void right() {
        System.out.println("PacMan goes RIGHT");
    }
    
}
