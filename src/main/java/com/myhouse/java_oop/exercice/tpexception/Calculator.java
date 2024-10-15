package com.myhouse.java_oop.exercice.tpexception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {

    public void divide(int a, int b){

        try {
            float result = a / b;
            System.out.println("Le resultat de la division de "+a+" par "+b+" est: "+result);
        } catch (ArithmeticException ae) {
            System.out.println("Division par 0 n'existe pas");
        }
    }

    public void getInput(){
        int exit = 0;
        Scanner scanner = new Scanner(System.in);
        while(exit == 0) {
            try {
                System.out.println("Entrer le premier nombre: ");

                int a = scanner.nextInt();
                System.out.println("Entrer le deuxième nombre: ");
                int b = scanner.nextInt();
                System.out.print("Enter operation (+, -, *, /): ");
                char operation = scanner.next().charAt(0);

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
                        divide(a, b);
                        break;
                    default:
                        System.out.println("L'opérateur n'existe pas");

                }

            } catch (InputMismatchException ie) {
                System.out.println("Vous devez saisir un entier");
                scanner.next();
            }
            System.out.print("Tapez 0 pour continuer : ");
            if (scanner.hasNextInt())
                exit = scanner.nextInt();
            else {
                System.out.print("Entier non saisi : ");
                scanner.next();
            }
        }
    }


    public static void main(String[] args){

        Calculator calculator = new Calculator();
        //calculator.divide(10, 0);
        calculator.getInput();
    }

}

