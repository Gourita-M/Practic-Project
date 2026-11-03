package com.youcode.formation.remise;


public class RemiseIfElse {

    public static Double appliquer(String niveau,double montant){
        if(niveau.equals("Silver")){
            return montant + (montant * 0.05);
        }else if(niveau.equals("Gold")){
            return montant + (montant * 0.10);
        }else if(niveau.equals("Platinum")) {
            return montant + (montant * 0.15);
        }else if(niveau.equals("Bronze")){
                return montant + (montant * 0.02);
        }else{
            System.out.println("Invalid Niveau");
            return null;
        }
    }
}
