package com.youcode.formation.remise;

public class RemiveBronze implements RemiseStrategy{

    @Override
    public String niveau(){
        return "Bronze";
    }

    @Override
    public double appliquer(double montant){
        return montant + (montant * 0.02);
    }
}
