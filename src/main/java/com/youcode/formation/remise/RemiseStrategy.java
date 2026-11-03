package com.youcode.formation.remise;

public interface RemiseStrategy {

    public String niveau();

    public double appliquer(double montant);
}
