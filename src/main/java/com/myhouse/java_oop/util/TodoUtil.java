package com.myhouse.java_oop.util;

import com.myhouse.java_oop.entity.Auteur;
import com.myhouse.java_oop.entity.Todo;

import java.util.*;

public class TodoUtil {

    public List<Todo> todosByAuteur(List<Auteur> auteurs){
        List<Todo> todosAuteurs = new ArrayList<Todo>();


        for (Auteur auteur : auteurs) {
            List<Todo> todos = auteur.getListeTodoAEffectue();
            todosAuteurs.addAll(todos);
        }

        return todosAuteurs;
    }

    public List<Todo> todosByAuteur(Auteur auteur1, Auteur auteur2){
        List<Todo> todosAuteurs = new ArrayList<Todo>();
        List<Todo> todos = auteur1.getListeTodoAEffectue();
        todosAuteurs.addAll(todos);
        todos = auteur2.getListeTodoAEffectue();
        todosAuteurs.addAll(todos);

        return todosAuteurs;
    }

    public Auteur addTodo(Auteur auteur, Todo todo){
        auteur.getListeTodoAEffectue().add(todo);
        return auteur;

    }

    public Set<Todo> convertTodo(List<Todo> todos){
        return new HashSet<Todo>(todos);
    }

    public List<Todo> sortTodosAuteurs(List<Auteur> auteurs){
        List<Todo> todosAuteurs = new ArrayList<Todo>();
        for(Auteur auteur : auteurs){
            List<Todo> todos = auteur.getListeTodoAEffectue();
            todosAuteurs.addAll(todos);
        }
        Collections.sort(todosAuteurs, new Comparator<Todo>() {
            @Override
            public int compare(Todo todoPrec, Todo todoSuiv) {
                return todoPrec.getTitre().compareTo(todoSuiv.getTitre());
            }
        });
        return todosAuteurs;

    }
}
