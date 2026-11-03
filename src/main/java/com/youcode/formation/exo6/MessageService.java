package com.youcode.formation.exo6;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class MessageService {

    public String message(String nom){
        return "Bonjour" + nom;
    }
}
