package com.youcode.formation.remise;

public class RemiseGold implements RemiseStrategy{

    @Override
    public String niveau(){
        return "Gold";
    }

    @Override
    public double appliquer(double montant){
        return montant + (montant * 0.10);
    }
}
