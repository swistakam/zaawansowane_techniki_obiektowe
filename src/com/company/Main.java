package com.company;



public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("canis","Pasztet");
        System.out.println("Pies nazywa się "+ dog.name);
        System.out.println("pies waży "+ dog.getWeight());
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.takeForAWalk();
        dog.feed();
        System.out.println("a po jedzonku "+ dog.getWeight());

        Human me = new Human("Pioter", "Urban");
        System.out.println(me.getWeight());
        System.out.println(me.name);
        me.takeForAWalk();

        Car rakietaPredkosci = new Car("golf IV", "VW", 1.9);
        System.out.println();



    }
}