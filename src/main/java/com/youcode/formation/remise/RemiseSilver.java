package com.youcode.formation.remise;

public class RemiseSilver implements RemiseStrategy{

    @Override
    public String niveau(){
        return "Silver";
    }

    @Override
    public double appliquer(double montant){
        return montant + (montant * 0.05);
    }
}
