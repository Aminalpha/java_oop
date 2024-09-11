package com.myhouse.java_oop;

import com.myhouse.java_oop.entity.Auteur;
import com.myhouse.java_oop.entity.Todo;
import com.myhouse.java_oop.share.TodoStatut;
import com.myhouse.java_oop.util.TodoUtil;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class TPTodoAuteur {
    public static void main(String[] args) {
        Todo todo1, todo2, todo3, todo4, todo1ListAut2, todo2ListAut2, todo1tabAut2;
        todo1 = new Todo();
        todo2 = new Todo();
        todo3 = new Todo();
        todo4 = new Todo();
        todo1ListAut2 = new Todo();
        todo2ListAut2 = new Todo();
        todo1tabAut2 = new Todo();

        todo1.setTitre("Titre Todo1 Toto");
        todo1.setDescription("Description Todo1");
        todo1.setDateCreation(LocalDate.now());
        todo1.setStatut(TodoStatut.CREATED);

        todo2.setTitre("Titre Todo2 tato");
        todo2.setDescription("Description Todo2");
        todo2.setDateCreation(LocalDate.now());
        todo2.setStatut(TodoStatut.CREATED);

        todo3.setTitre("Titre Todo3 Am");
        todo3.setDescription("Description Todo3");
        todo3.setDateCreation(LocalDate.now());
        todo3.setStatut(TodoStatut.CREATED);

        todo4.setTitre("Titre Todo4 AAAA");
        todo4.setDescription("Description Todo4");
        todo4.setDateCreation(LocalDate.now());
        todo4.setStatut(TodoStatut.CREATED);

        todo1ListAut2.setTitre("Titre Todo1 effectue Auteur yyyy");
        todo1ListAut2.setDescription("Description Todo1 effectue Auteur 2");
        todo1ListAut2.setDateCreation(LocalDate.now());
        todo1ListAut2.setStatut(TodoStatut.CREATED);

        todo2ListAut2.setTitre("Titre Todo2 effectue Auteur cccc");
        todo2ListAut2.setDescription("Description Todo2 effectue Auteur 2");
        todo2ListAut2.setDateCreation(LocalDate.now());
        todo2ListAut2.setStatut(TodoStatut.CREATED);

        todo1tabAut2.setTitre("Titre Todo1 a faire Auteur 2 IIIIII");
        todo1tabAut2.setDescription("Description Todo1 a faire Auteur 2");
        todo1tabAut2.setDateCreation(LocalDate.now());
        todo1tabAut2.setStatut(TodoStatut.CREATED);


        Auteur auteur1, auteur2;
        auteur1 = new Auteur();
        auteur2 = new Auteur();
        auteur1.setNom("NomAuteur1");
        auteur1.setPrenom("PrenomAuteur1");

        auteur2.setNom("NomAuteur2");
        auteur2.setPrenom("PrenomAuteur2");

        ArrayList<Todo> todosAuteur1, todosAuteur2;
        todosAuteur1 = new ArrayList<Todo>();
        todosAuteur2 = new ArrayList<Todo>();

        todosAuteur1.add(todo1);
        todosAuteur1.add(todo2);

        todosAuteur2.add(todo1ListAut2);
        todosAuteur2.add(todo2ListAut2);

        Todo[] tableauAut1 = new Todo[2];

        tableauAut1[0] = todo3;
        tableauAut1[1] = todo4;

        Todo[] tableauAut2 = new Todo[1];
        tableauAut2[0] = todo1tabAut2;

        auteur1.setListeTodoAEffectue(todosAuteur1);
        auteur1.setTableauTodo(tableauAut1);

        auteur2.setListeTodoAEffectue(todosAuteur2);
        auteur2.setTableauTodo(tableauAut2);

        ArrayList<Auteur> listAuteurs = new ArrayList<Auteur>();
        listAuteurs.add(auteur1);
        listAuteurs.add(auteur2);
        listAuteurs.add(auteur1);
        Set<Auteur> setAuteurs = new HashSet<Auteur>();
        setAuteurs.add(auteur1);
        setAuteurs.add(auteur2);
        setAuteurs.add(auteur1);

        for (int i = 0; i < listAuteurs.size(); i++) {
            Auteur auteurCourant = listAuteurs.get(i);
            System.out.println(auteurCourant.getNom() + " " + auteurCourant.getPrenom());
            for (int j = 0; j < auteurCourant.getListeTodoAEffectue().size(); j++) {
                System.out.println(auteurCourant.getListeTodoAEffectue().get(j));
            }
        }
        System.out.println("------------------------------1---------------------------------");

        for(Auteur auteurCourant : setAuteurs){
            System.out.println(auteurCourant.getNom() + " " + auteurCourant.getPrenom());
            for(int j = 0; j < auteurCourant.getListeTodoAEffectue().size(); j++){
                System.out.println(auteurCourant.getListeTodoAEffectue().get(j));
            }
        }

        System.out.println("------------------------------2---------------------------------");

        int i = 0;
        String titreAcherche = "Titre Todo1 effectue Auteur 2";
        boolean auteurTrouver = false;

        while(i < listAuteurs.size() && !auteurTrouver){
            int j = 0;
            Auteur auteurCourant = listAuteurs.get(i);
            while (j < auteurCourant.getListeTodoAEffectue().size() && !auteurCourant.getListeTodoAEffectue().get(j).getTitre().equals(titreAcherche)
                     ){
                j++;
                auteurTrouver = false;
            }
            if(j < auteurCourant.getListeTodoAEffectue().size()){
                auteurTrouver = true;
            }
            i++;
        }
        System.out.println("------------------------------3---------------------------------");

        TodoUtil todoUtil = new TodoUtil();
        System.out.println("Le nombre total des Todos des auteurs mélangés est de : "+ todoUtil.todosByAuteur(listAuteurs).size());

        System.out.println("------------------------------Add Todo---------------------------------");

        Todo ajoutTodo1 = new Todo("Add Todo1", "Add Description Todo1", LocalDate.now(), TodoStatut.CREATED);
        todoUtil.addTodo(auteur2, ajoutTodo1);

        System.out.println("------------------------------Sort Todos Auteur---------------------------------");
        //sortTodosAuteurs
        TodoUtil todoUtil1 = new TodoUtil();
        List<Todo> todos = todoUtil1.sortTodosAuteurs(listAuteurs);
        for(Todo todo: todos ){
            System.out.println(todo.getTitre());
        }


    }
}
