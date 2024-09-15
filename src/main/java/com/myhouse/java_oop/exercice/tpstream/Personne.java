package com.myhouse.java_oop.exercice.tpstream;

public class Personne {
    String name;
    int age;
    Gender gender;
    double salary;

    public Personne(String name, int age, Gender gender, double salary){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }
    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString(){
        return "Name: " + name + " Age: " + age + " Gender: " + gender + " Salary: " + salary;
    }
}
