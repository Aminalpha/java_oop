package com.myhouse.java_oop.entity;

import java.time.LocalDate;

public class Hyundai extends Voiture {

    public Hyundai(String numSerie, LocalDate anneeCreation, int nbreChavaux, String marque) {
        super(numSerie, anneeCreation, nbreChavaux, marque);
    }

    @Override
    public String systemDemarrage() {
        return "Bouton";
    }


}
