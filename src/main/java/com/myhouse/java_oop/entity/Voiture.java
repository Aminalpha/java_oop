package com.myhouse.java_oop.entity;


import java.time.LocalDate;
import java.time.Period;


public abstract class Voiture implements Comparable<Voiture> {
    private String numSerie;
    private LocalDate anneeCreation;
    private int nbreChevaux;
    private String marque = this.getClass().getName();

    public Voiture(String numSerie, LocalDate anneeCreation, int nbChevaux, String marque) {
        this.numSerie = numSerie;
        this.anneeCreation = anneeCreation;
        this.nbreChevaux = nbChevaux;
        this.marque = marque;

    }

    public abstract String systemDemarrage();

    public String getNumSerie() {
        return numSerie;
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public LocalDate getAnneeCreation() {
        return anneeCreation;
    }

    public void setAnneeCreation(LocalDate anneeCreation) {
        this.anneeCreation = anneeCreation;
    }

    public int getNbreChevaux() {
        return nbreChevaux;
    }

    public void setNbreChevaux(int nbreChevaux) {
        this.nbreChevaux = nbreChevaux;
    }

    public int valeurVoiture() {
        return this.nbreChevaux - Period.between(this.getAnneeCreation(),
                    LocalDate.now()).getYears() * 2;

    }


    public int compareTo(Voiture voiture) {

        return this.valeurVoiture() - voiture.valeurVoiture();
    }

    public String toString(){
        return this.numSerie+", "+ this.anneeCreation+", "+
                this.nbreChevaux+", "+this.valeurVoiture()+", "+this.systemDemarrage();
    }

    public String getMarque() {
        return this.marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
}
