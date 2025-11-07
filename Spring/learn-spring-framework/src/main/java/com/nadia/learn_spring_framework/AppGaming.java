package com.nadia.learn_spring_framework;

public class AppGaming {

    public static void main(String[] args) {
        System.out.println("Welcome to the Gaming App!");
        System.out.println("....".repeat(30));
        GamingConsole game = new MarioGame();
        GameRunner runner = new GameRunner(game);
        runner.run();

        System.out.println("....".repeat(30));
        game = new SuperContraGame();
        runner = new GameRunner(game);
        runner.run();


        System.out.println("....".repeat(30));
        game = new PacMan();
        runner = new GameRunner(game);
        runner.run();
    }
}
    