package com.youcode.formation.runner;

import com.youcode.formation.config.PrimaryConfig;
import com.youcode.formation.exo4.CompteurPrototype;
import com.youcode.formation.exo4.CompteurSingleton;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private final ApplicationContext applicationContext;

    public DemoRunner(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public void run(String... args){
        CompteurSingleton s1 = applicationContext.getBean(CompteurSingleton.class);
        CompteurSingleton s2 = applicationContext.getBean(CompteurSingleton.class);

        System.out.println("ID 1: " + s1.getId());
        System.out.println("ID 2: " + s2.getId());

        System.out.println(s1.getId() == s2.getId());

        CompteurPrototype p1 = applicationContext.getBean(CompteurPrototype.class);
        CompteurPrototype p2 = applicationContext.getBean(CompteurPrototype.class);

        System.out.println("ID 1: " + p1.getId());
        System.out.println("ID 2: " + p2.getId());

        System.out.println(p1.getId() == p2.getId());
    }
}