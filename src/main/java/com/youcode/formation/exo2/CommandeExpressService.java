package com.youcode.formation.exo2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class CommandeExpressService implements CommandeService{

    @Override
    public String traiter(String reference){
        //for now
        return reference;
    }
}
