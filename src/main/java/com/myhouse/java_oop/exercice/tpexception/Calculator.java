package com.myhouse.java_oop.exercice.tpexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    Scanner scan =  new Scanner(System.in);

    public float divide(int a, int b){
        return a / b;
    }

    public void calculatrice(int a, int b){
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scan.next().charAt(0);
        switch (operation) {
            case '+':
                System.out.println("Le resultat de l'addition est: "+ (a + b));
                break;
            case '-':
                System.out.println("Le resultat de la soustraction est: " + (a - b));
                break;
            case '*':
                System.out.println("Le resultat de la multiplication est: " + a * b);
                break;
            case '/':
                try {
                    System.out.println("Le resultat de la division de "+a+" par "+b+" est: "+divide(a,b));
                } catch (ArithmeticException ae) {
                    System.out.println("Division par 0 n'existe pas");
                }
                break;
            default:
                System.out.println("L'opérateur n'existe pas");

        }
    }

    public void saisiEntier(){
        try {
            System.out.println("Entrer le premier nombre: ");

            int a = scan.nextInt();
            System.out.println("Entrer le deuxième nombre: ");
            int b = scan.nextInt();

            calculatrice(a, b);

        } catch (InputMismatchException ie) {
            System.out.println("Vous devez saisir un entier");
            scan.next();
        }
    }
    public void getInput(){
        int exit = 0;
        while(exit == 0) {
            saisiEntier();
            System.out.print("Tapez 0 pour continuer : ");
            if (scan.hasNextInt())
                exit = scan.nextInt();
            else {
                System.out.print("Entier non saisi : ");
                scan.next();
            }
        }
    }


    public static void main(String[] args){

        Calculator calculator = new Calculator();
        calculator.getInput();
    }

}

