package com.company;


import com.company.creatures.Animal;
import com.company.creatures.FoodType;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Disel;
import com.company.devices.Phone;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
        Pet dog = new Pet("canis","Pasztet");
        System.out.println("Pies nazywa się "+ dog.name);
        System.out.println("pies waży "+ dog.getWeight());
        dog.takeForAWalk();
        dog.feed2(1.0,FoodType.ALL);
        dog.feed2(2.0,FoodType.MEET);
        dog.feed2(2.0,FoodType.MEET);
        System.out.println("a po jedzonku "+ dog.getWeight());

        Human me = new Human("Pioter", "Urban");
        System.out.println(me.getWeight());
        System.out.println(me.name);
        me.takeForAWalk();

        Disel rakietaPredkosci = new Disel("golf IV", "VW", 1.9, 3000.0, 1999);
        Double test = me.getSalary();
        me.setSalary(100.0);
        test = me.getSalary();
        test = me.getSalary();
        Disel rakietaPredkosciSecond = new Disel("golf IV", "VW", 1.9, 3000.0, 1999);
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

        romek.sell(romek,jaro,750.0);
        System.out.println(romek.toString());
        System.out.println(jaro.toString());

        Phone nokia = new Phone();
        nokia.operationSystem = Phone.OperationSystem.WINDOWS_MOBILE;

        System.out.println(Country.ALBANIA.getGDPinPLN());
        System.out.println(Country.POLAND.getGDPinPLN());

        Map<String, Country> capitals = new HashMap<>();
        capitals.put("Warsaw", Country.POLAND);
        capitals.put("Kuvendi", Country.ALBANIA);
        capitals.put("Luanda",Country.ANGOLA);

        Map<Country, Double> countryArea = new HashMap<>();
        countryArea.put(Country.POLAND,312696.0);
        countryArea.put(Country.ALBANIA,28748.0);
        countryArea.put(Country.ANGOLA,1246700.0);
        countryArea.put(Country.COLOMBIA,1139825.0);
        countryArea.put(Country.USA,9833520.0);

        TreeMap<Country, Double> sorted = new TreeMap<>();
        sorted.putAll(countryArea);
        System.out.println(sorted);

        Double biggest;
        for (Map.Entry<Country,Double> x: countryArea.entrySet()) {
            Double value = x.getValue();
        }


    }
}