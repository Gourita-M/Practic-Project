package com.youcode.formation.exo6;

import lombok.Getter;

@Getter
public class GreeterConstructeur {
    private final MessageService messageService;

    public GreeterConstructeur(MessageService messageService){
        this.messageService = messageService;
    }

    public void saluer(String nom){
        System.out.println(messageService.message(nom));
    }
}
