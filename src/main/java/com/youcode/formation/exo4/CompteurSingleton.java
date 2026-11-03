package com.youcode.formation.exo4;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("singleton")
@Getter
public class CompteurSingleton {
    private final UUID id = UUID.randomUUID();
}
