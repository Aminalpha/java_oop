package com.myhouse.java_oop;

import com.myhouse.java_oop.entity.*;

import java.time.LocalDate;
import java.util.*;

public class TPVoiture extends Object{

    public static void main(String[] args) {
        Voiture toyota1 = new Toyota("T01AB", LocalDate.of(2000,7,1),
                500, "Toyota");

        Voiture toyota2 = new Toyota("T02AB", LocalDate.of(1999,9,30),
                700, "Toyota");

        Voiture mazda1 = new Mazda("M01AB", LocalDate.of(2009,5,30),
                1200, "Mazda");
        Voiture mazda2 = new Mazda("M02AB", LocalDate.of(2006,9,30),
                700, "Mazda");
        Voiture mazda3 = new Mazda("M03AB", LocalDate.of(2010,7,1),
                500, "Mazda");
        Voiture mazda4 = new Mazda("M04AB", LocalDate.of(2021,3,31),
                900, "Mazda");

        Voiture hyundai1 = new Hyundai("H04AB", LocalDate.of(2007,3,31),
                300, "Hyundai");

        List <Voiture> listVoitures = new ArrayList<Voiture>();
        listVoitures.add(toyota1);
        listVoitures.add(toyota2);
        listVoitures.add(mazda1);
        listVoitures.add(mazda2);
        listVoitures.add(mazda3);
        listVoitures.add(mazda4);
        listVoitures.add(hyundai1);

        System.out.println("Avant Tri");
        for (Voiture voiture : listVoitures) {
            System.out.println(voiture);
        }

        Collections.sort(listVoitures);
        System.out.println("Après Tri");
        for (Voiture voiture : listVoitures) {
            System.out.println(voiture);
        }

        System.out.println("-----------------Liste des systemes de demarrage du parking----------------");
        Set<String> setSystemDemarrage = new HashSet<String>();
        for(Voiture voiture : listVoitures){
            setSystemDemarrage.add(voiture.systemDemarrage());
        }
        System.out.println(setSystemDemarrage);

        System.out.println("---------------Groupe de voiture par marque----------");
        Map<String, List<Voiture>> mapMarqueVoitures = new HashMap<>();
        List<Voiture> groupToyota = new ArrayList<Voiture>();
        List<Voiture> groupMazda = new ArrayList<Voiture>();
        List<Voiture> groupHyundai = new ArrayList<Voiture>();
        for(Voiture voiture : listVoitures){
            if(Objects.equals(voiture.getMarque(), "Toyota")){
                groupToyota.add(voiture);
            }
            else if(voiture.getMarque() == "Mazda"){
                groupMazda.add(voiture);
            }
            else groupHyundai.add(voiture);
        }
        mapMarqueVoitures.put("Toyota", groupToyota);
        mapMarqueVoitures.put("Mazda", groupMazda);
        mapMarqueVoitures.put("Hyundai", groupHyundai);

        System.out.println("Groupe Toyota \n"+ mapMarqueVoitures.get("Toyota"));

        System.out.println("Groupe Mazda \n"+ mapMarqueVoitures.get("Mazda"));

        System.out.println("Groupe Hyundai \n"+ mapMarqueVoitures.get("Hyundai"));


        System.out.println("-----------Liste des marques de Voiture--------");
        Set<String> setMarque = new HashSet<String>();
        for(Voiture voiture : listVoitures){
            setMarque.add(voiture.getMarque());
        }
        for(String marque : setMarque){
            System.out.println(marque);
        }

    }

}
