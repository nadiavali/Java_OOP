package com.nadia.gaming;

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
        runner = new GameRunner(game); //obj creation + wiring of dependencies /Game is the dependency of GameRunner// game is injected into GameRunner
        runner.run();
    }
}
    