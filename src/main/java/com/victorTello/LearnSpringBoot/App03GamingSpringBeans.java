package com.victorTello.LearnSpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.victorTello.LearnSpringBoot.game.GamingConsole;

public class App03GamingSpringBeans {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GamingConsole.class).up();
        }

    }
}
