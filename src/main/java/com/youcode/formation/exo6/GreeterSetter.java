package com.youcode.formation.exo6;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Getter
public class GreeterSetter {
    private MessageService messageService;

    @Autowired
    public void setMessageService(MessageService messageService){
        this.messageService = messageService;
    }

    public void saluer(String nom){
        System.out.println(messageService.message(nom));
    }
}
