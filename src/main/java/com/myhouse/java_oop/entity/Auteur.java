package com.myhouse.java_oop.entity;

import java.util.List;

public class Auteur {
    private String nom;
    private String prenom;
    private List<Todo> listeTodoAEffectue;
    private Todo[] tableauTodo;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Todo> getListeTodoAEffectue() {
        return listeTodoAEffectue;
    }

    public void setListeTodoAEffectue(List<Todo> listeTodoAEffectue) {
        this.listeTodoAEffectue = listeTodoAEffectue;
    }

    public Todo[] getTableauTodo() {
        return tableauTodo;
    }

    public void setTableauTodo(Todo[] tableauTodo) {
        this.tableauTodo = tableauTodo;
    }
}
