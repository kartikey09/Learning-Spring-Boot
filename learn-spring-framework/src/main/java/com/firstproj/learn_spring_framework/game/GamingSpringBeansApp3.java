package com.firstproj.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@ComponentScan("com.firstproj.learn_spring_framework.game")
public class GamingSpringBeansApp3 {

    @Bean
    public GameRunner gameRuner(GamingConsole Console){
        return new GameRunner(Console);
    }

    public static void main(String args[]){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(GamingSpringBeansApp3.class);
        var marioGame = context.getBean(GameRunner.class);
        marioGame.run();
    }
}
