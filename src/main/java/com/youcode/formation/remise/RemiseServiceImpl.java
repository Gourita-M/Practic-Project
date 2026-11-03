package com.youcode.formation.remise;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RemiseServiceImpl implements RemiseService{
    private List<RemiseStrategy> remiseStrategy;

    public RemiseServiceImpl(List<RemiseStrategy> strategies) {
        this.remiseStrategy = remiseStrategy;
    }

    @Override
    public double appliquer(String niveau, double montant){
        return remiseStrategy.stream()
                .filter(r -> r.niveau().equals(niveau))
                .findFirst()
                //.orElse(null)
                .orElseThrow(
                        () -> new IllegalArgumentException(
                                "Can't Be Find"
                        ))
                .appliquer(montant);
    }
}
