package com.victorTello.LearnSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.victorTello.LearnSpringBoot.game.GamingConsole;
import com.victorTello.LearnSpringBoot.game.PacmanGame;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

}
