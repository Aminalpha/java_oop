package com.myhouse.java_oop.exercice.tpstream;

import org.springframework.util.comparator.Comparators;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class TPStreamPersonne {
    public static void main(String[] args) {

        List<Personne> people = Arrays.asList(
                new Personne("John", 30, Gender.MALE, 55000),
                new Personne("Jane", 25, Gender.FEMALE, 48000),
                new Personne("Alice", 35, Gender.FEMALE, 75000),
                new Personne("Bob", 40, Gender.MALE, 62000),
                new Personne("Charlie", 28, Gender.MALE, 52000),
                new Personne("Emily", 23, Gender.FEMALE, 47000),
                new Personne("George", 60, Gender.MALE, 80000),
                new Personne("Diana", 32, Gender.FEMALE, 59000),
                new Personne("Frank", 45, Gender.MALE, 45000),
                new Personne("Hannah", 55, Gender.FEMALE, 95000),
                new Personne("Ian", 38, Gender.MALE, 67000),
                new Personne("Kate", 29, Gender.FEMALE, 53000),
                new Personne("Luke", 41, Gender.MALE, 72000),
                new Personne("Maria", 33, Gender.FEMALE, 84000),
                new Personne("Nina", 26, Gender.FEMALE, 51000),
                new Personne("Oliver", 37, Gender.MALE, 78000)
        );

        //List<String> namesMore25Old = new ArrayList<String>();
        //List<Personne> salaryIncrease = new ArrayList<Personne>();
        // .forEach(p -> namesMore25Old.add(p.getName()))
        people.stream()
                .filter(p -> p.getAge() > 25)
                .map(p -> p.getName())
                .forEach(System.out::println);

        people.stream()
                .map(p -> new Personne(p.getName(), p.getAge(), p.getGender(), (p.getSalary()*(1+10/100))))
                .forEach(System.out::println);

        double sum = people.stream()
                .map(p -> p.getSalary())
                .reduce(0.0, Double::sum)
        ;
        System.out.println("----La somme totale de tout les salaires: " + sum);

        System.out.println("----The top 3 highest earners and their names.");
        people.stream()
                .sorted(Comparator.comparingDouble(Personne::getSalary).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("Group the people by gender.");
        people.stream()
                .collect(Collectors.groupingBy(Personne::getGender))
                .forEach((k, p)-> System.out.println(k + ": " + p));
                ;

        ;

        System.out.println("----The number of people whose salary is greater than $50,000: "+
        people.stream()
                .filter(p->p.getSalary() > 50000)
                .count());
        ;

        System.out.println("----The person with the highest salary: ");
        people.stream()
                .sorted(Comparator.comparingDouble(Personne::getSalary).reversed())
                .limit(1)
                .forEach(System.out::println);

        System.out.println("----Summary of salaries: "+  people.stream()
                .mapToDouble(p -> p.getSalary() )
                .summaryStatistics());
    }
}
