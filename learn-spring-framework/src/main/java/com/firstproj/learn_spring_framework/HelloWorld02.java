package com.firstproj.learn_spring_framework;

import com.firstproj.learn_spring_framework.game.GameRunner;
import com.firstproj.learn_spring_framework.game.MarioGame;
import com.firstproj.learn_spring_framework.game.PacManGame;
import com.firstproj.learn_spring_framework.game.SuperContraGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class HelloWorld02 {
    public static void main(String args[]){
        //launch a spring context;
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(HelloworldConfiguration.class);  //launches the specified spring context class
        //retrieving the bean managed by spring
        System.out.println(context.getBean("name")); //the method name of which the bean i want
         //configure the things that we want spring to manage;
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2"));
        System.out.println(context.getBean(Address.class));
        System.out.println(context.getBean("person2MethodCall"));
        System.out.println(context.getBean(Person.class));

        System.out.println(context.getBeanDefinitionCount());

        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
