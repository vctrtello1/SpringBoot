package com.victorTello.LearnSpringBoot.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

// Released in Java 16
record Person(String name, int age, Address address) {
};

record Address(String firstLine, String City) {
};

@Configuration
public class HelloWorldConfigutation {

    @Bean
    public String name() {
        return "Victor";
    }

    @Bean
    public int age() {
        return 31;
    }

    @Bean
    public Person person() {
        return new Person("Lucia", 32, new Address("Ferreria", "Mexico City"));
    }

    @Bean
    public Person person2MethodCall() {
        return new Person(name(), age(), address()); // name, age
    }

    @Bean
    public Person person3PersonParameters(String name, int age, Address address3) {
        return new Person(name, age, address3); // name, age, address
    }

    @Bean
    @Primary
    public Person person4PersonParameters(String name, int age, Address address) {
        return new Person(name, age, address); // name, age, address
    }

    @Bean
    public Person person5Qualifier(String name, int age, @Qualifier("address3qualifier") Address address) {
        return new Person(name, age, address); // name, age, address
    }

    @Bean(name = "address2")
    @Primary
    public Address address() {
        return new Address("Caballito", "Mexico City");
    }

    @Bean(name = "address3")
    @Qualifier("address3qualifier")
    public Address address3() {
        return new Address("Rio Street", "Cuauhtemoc");
    }
}
