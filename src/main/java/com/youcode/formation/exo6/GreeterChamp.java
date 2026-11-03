package com.youcode.formation.exo6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GreeterChamp {

    @Autowired
    private MessageService messageService;

    public void saluer(String nom){
        System.out.println(messageService.message(nom));
    }
}
