package com.youcode.formation.remise;

public class RemisePlatinum implements RemiseStrategy{

    @Override
    public String niveau(){
        return "Platinum";
    }

    @Override
    public double appliquer(double montant){
        return montant + (montant * 0.15);
    }

}
