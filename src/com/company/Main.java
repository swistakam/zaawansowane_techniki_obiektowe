package com.company;



public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis","Pasztet");
        System.out.println("Pies nazywa się "+ dog.name);
        System.out.println("pies waży "+ dog.getWeight());
        dog.feed();
        dog.feed();
        dog.feed();
        dog.feed();
        System.out.println("a po jedzonku "+ dog.getWeight());
    }
}