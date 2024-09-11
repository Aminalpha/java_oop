package com.myhouse.java_oop.entity;

import java.time.LocalDate;

public class Mazda extends Voiture{

    public Mazda(String numSerie, LocalDate anneeCreation, int nbCheveaux, String marque){
        super(numSerie, anneeCreation, nbCheveaux, marque);
    }

    @Override
    public String systemDemarrage() {
        return "Cle";
    }


}
