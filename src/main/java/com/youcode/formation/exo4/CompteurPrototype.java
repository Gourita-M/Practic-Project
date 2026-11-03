package com.youcode.formation.exo4;

import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope("prototype")
@Getter
public class CompteurPrototype {
    private final UUID id = UUID.randomUUID();
}
