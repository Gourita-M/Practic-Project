package com.youcode.formation.exo2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Consommateur{
    private final CommandeService commandeService;

    public Consommateur(
            @Qualifier("commandeExpressService")
            CommandeService commandeService){
        this.commandeService = commandeService;
    }

    public CommandeService getCommandeService() {
        return commandeService;
    }
}
