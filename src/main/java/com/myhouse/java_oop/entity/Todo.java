package com.myhouse.java_oop.entity;

import com.myhouse.java_oop.share.TodoStatut;


import java.time.LocalDate;

public class Todo {
    private String titre;
    private String description;
    private LocalDate dateCreation;
    private TodoStatut statut;

    public Todo(){

    }

    public Todo(String titre, String description, LocalDate dateCreation, TodoStatut statut ){
        this.titre = titre;
        this.description = description;
        this.dateCreation = dateCreation;
        this.statut = statut;

    }

    public String getTitre(){
        return this.titre;
    }

    public void setTitre(String titre){
        this.titre = titre;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public LocalDate getDateCreation(){
        return this.dateCreation;
    }
    public void setDateCreation(LocalDate dateCreation){
        this.dateCreation = dateCreation;
    }

    public TodoStatut getStatut(){
        return this.statut;
    }

    public void setStatut(TodoStatut statut) {
        this.statut = statut;
    }

    public String toString(){
        return "Titre: "+titre + ",\tDescription: "+ description + ",\tDate de Creation:" + dateCreation + ",\tStatut: " + statut;
    }
}
