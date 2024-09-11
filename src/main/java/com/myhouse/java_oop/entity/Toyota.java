package com.myhouse.java_oop.entity;

import java.time.LocalDate;

public class Toyota extends Voiture{


    public Toyota(String numSerie, LocalDate dateCreation, int nbChevaux, String marque) {
        super(numSerie, dateCreation, nbChevaux, marque);
    }


    @Override
    public String systemDemarrage() {
        return "Bouton";
    }

}
