package com.victorTello.LearnSpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.victorTello.LearnSpringBoot.game.GameRunner;
import com.victorTello.LearnSpringBoot.game.GamingConsole;
import com.victorTello.LearnSpringBoot.game.PacmanGame;

@Configuration
class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        return new PacmanGame();
    }

    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        return new GameRunner(game);
    }

}

public class App04GammingSpringBeans {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }

}
