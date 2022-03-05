package com.company.creatures;

import com.company.creatures.Animal;
import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class Human extends Animal {

    public String firstName;
    public String lastName;
    private Double salary;
    private Car car;
    private Double previousSalary;
    private String lastCheckTime;
    private Double cash;
    public Phone phone;
    public Animal animal;

    public Human(String firstName, String lastName){
        super("Homo sapiens ", firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Double getSalary(){
        if(lastCheckTime != null){
           System.out.println("Ostatni data sprawdzenia to:" + lastCheckTime);
            System.out.println("Wynosiła on wtedy: " + previousSalary);
        }else{
            System.out.println("Pierwsze sprawdzenie konta!");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formatDate = LocalDateTime.now().format(formatter);
        lastCheckTime = formatDate;
        previousSalary = salary;
        return  salary;
    }

    public void setSalary(Double salary){
        if(salary>0){
            System.out.println("Została dodana nowa wpłata do systemu");
            System.out.println("Aneks do umowy bardzo proszę odebrać od Pani Hanny Kowalskiej z działu kadr");
            System.out.println("ZUS i US już i tak o tym wiedzą, daj sobie lepiej spokój. Na co ci to?");
            this.salary = salary;
        }else{
            System.out.println("Co to za minusowe wartości? Co to ma być!?");
        }
    }

    public Car getCar(){
        return car;
    }

    public void setCar(Car car){
        if(salary > car.getPrice()){
            System.out.println("Udało się kupić za gotówkę!");
            this.car = car;
        }else if(salary > (car.getPrice()/12)){
            System.out.println("Udało się kupić ale co mam mówić... Masz teraz kredyt");
            this.car =car;
        }else{
            System.out.println("zapisz się na studia i znajdź nową robotę albo idź po podwyżkę");
        }
    }



    public String toString(){
        return firstName+" "+lastName+" "+salary+" "+car+" "+previousSalary+" "+lastCheckTime+" "+animal+" "+cash;

    }

    @Override
    public void beEaten() {

    }

    public Double getCash() {
        return cash;
    }

    public void setCash(Double cash) {
        this.cash = cash;
    }
}