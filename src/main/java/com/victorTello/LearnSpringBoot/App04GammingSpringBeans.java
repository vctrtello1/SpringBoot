package com.victorTello.LearnSpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.victorTello.LearnSpringBoot.game.GameRunner;
import com.victorTello.LearnSpringBoot.game.GamingConsole;

@Configuration
@ComponentScan("com.victorTello.LearnSpringBoot.game")
public class App04GammingSpringBeans {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App04GammingSpringBeans.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GameRunner.class).run();
        }

    }

}
