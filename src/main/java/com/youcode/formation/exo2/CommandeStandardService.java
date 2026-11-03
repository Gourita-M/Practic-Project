package com.youcode.formation.exo2;

import org.springframework.stereotype.Service;

@Service
public class CommandeStandardService implements CommandeService{

    @Override
    public String traiter(String reference){
        //for now
        return reference;
    }
}
