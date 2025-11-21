package com.firstproj.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//record is a class, but it contains the getters and setters and constructor by default so that we can avoid the boiler plate code;
record Person(String name, int age, Address address){};
record Address(String street, String city){};

@Configuration
//^this class contains the beans that we would want to manage using spring
public class HelloworldConfiguration {
    @Bean
    //this method produces a bean to be managed by the spring container
    public String name(){
        return "Kartikey Rana";
    }

    @Bean
    public Person person(){
        var person = new Person("kartikey Dubey", 25, new Address("street1", "Uterecth"));
        return person;
    }

    @Bean(name = "address2")  //custom Bean name
    public Address address(){
        var address = new Address("123 Main St", "New York");
        return address;
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), 18, new Address("123 Main St", "New York"));
    }

    @Bean
    public Person person3(String name, Address address){
        return new Person(name, 18,address);
    }
}
