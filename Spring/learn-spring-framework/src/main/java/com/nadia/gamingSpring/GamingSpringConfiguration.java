package com.nadia.gamingSpring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.nadia.gaming.GamingConsole;
import com.nadia.gaming.GameRunner;
import com.nadia.gaming.MarioGame;
import com.nadia.gaming.PacMan;

@Configuration
public class GamingSpringConfiguration {
    
    @Bean
    public GamingConsole MarioGame() {
        var game = new MarioGame();
        return game;
    }

    @Bean
    public GamingConsole PacMan() {
        var game = new PacMan();
        return game;
    }
    @Bean("PacManGameRunner")
    public GameRunner PacManGameRunner(@Qualifier("PacMan") GamingConsole game) {
    return new GameRunner(game);
}

    @Bean("MarioGameRunner")
    public GameRunner MarioGameRunner(@Qualifier("MarioGame") GamingConsole game) {
        return new GameRunner(game);
    }}
