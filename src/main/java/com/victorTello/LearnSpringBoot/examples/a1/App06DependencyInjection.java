package com.victorTello.LearnSpringBoot.examples.a1;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
class YourBusinessClass {

    Dependency1 dependency1;

    Dependency2 dependency2;

    // Recomended

    public YourBusinessClass(Dependency1 dependency1, Dependency2 dependency2) {
        System.out.println("Constructor Injection - YourBusinessClass");
        this.dependency1 = dependency1;
        this.dependency2 = dependency2;
    }

    public String toString() {

        return "Using " + dependency1 + " and " + dependency2;

    }

    /*
     * @Autowired
     * public void setDependency1(Dependency1 dependency1) {
     * System.out.println("Setter Injection - SetDependency 1 ");
     * this.dependency1 = dependency1;
     * }
     * 
     * @Autowired
     * public void setDependency2(Dependency2 dependency2) {
     * System.out.println("Setter Injection - SetDependency 2 ");
     * this.dependency2 = dependency2;
     * }
     */

}

@Component
class Dependency1 {

}

@Component
class Dependency2 {

}

@Configuration
@ComponentScan
public class App06DependencyInjection {

    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(App06DependencyInjection.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            // System.out
            System.out.println(context.getBean(YourBusinessClass.class));

        }

    }

}
