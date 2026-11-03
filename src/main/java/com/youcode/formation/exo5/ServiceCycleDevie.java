package com.youcode.formation.exo5;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class ServiceCycleDevie {
    public ServiceCycleDevie(){
        System.out.println("Construct");
    }

    @PostConstruct
    public void metho(){
        System.out.println("PostConstruct");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("PreDestroy");
    }
}
