package com.nadia.learn_spring_framework;

public class GameRunner {
    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game = game;
    }
  

    public void run() {
        System.err.println("Running Game " + game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
   
    }

