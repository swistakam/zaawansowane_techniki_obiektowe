package com.company;


import com.company.devices.Car;

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

        Car rakietaPredkosci = new Car("golf IV", "VW", 1.9, 3000.0);
        Double test = me.getSalary();
        me.setSalary(100.0);
        test = me.getSalary();
        test = me.getSalary();
        Car rakietaPredkosciSecond = new Car("golf IV", "VW", 1.9, 3000.0);
        System.out.println(rakietaPredkosci.equals(rakietaPredkosciSecond));
        System.out.println(rakietaPredkosci);
        System.out.println(rakietaPredkosciSecond);

        System.out.println(me);
        System.out.println(dog);

    }
}