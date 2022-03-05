package com.company;


import com.company.creatures.Animal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis","Pasztet");
        System.out.println("Pies nazywa się "+ dog.name);
        System.out.println("pies waży "+ dog.getWeight());
        dog.takeForAWalk();
        dog.feed2();
        System.out.println("a po jedzonku "+ dog.getWeight());

        Human me = new Human("Pioter", "Urban");
        System.out.println(me.getWeight());
        System.out.println(me.name);
        me.takeForAWalk();

        Car rakietaPredkosci = new Car("golf IV", "VW", 1.9, 3000.0, 1999);
        Double test = me.getSalary();
        me.setSalary(100.0);
        test = me.getSalary();
        test = me.getSalary();
        Car rakietaPredkosciSecond = new Car("golf IV", "VW", 1.9, 3000.0, 1999);
        System.out.println(rakietaPredkosci.equals(rakietaPredkosciSecond));
        System.out.println(rakietaPredkosci);
        System.out.println(rakietaPredkosciSecond);

        System.out.println(me);
        System.out.println(dog);

        Phone redmi5 = new Phone();

        rakietaPredkosci.turnOn();
        redmi5.turnOn();

        Human romek = new Human("Romuald", "Stefaniak");
        romek.setCash(1000.0);
        romek.animal = dog;
        Human jaro = new Human("Jarek", "Psikuta");
        jaro.setCash(3000.0);

        romek.sall(romek,jaro,750.0);
        System.out.println(romek.toString());
        System.out.println(jaro.toString());

    }
}