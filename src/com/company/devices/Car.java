package com.company.devices;

import com.company.creatures.Human;

import java.util.List;

public abstract class Car extends Device {
    private Double engine;
    public List<String> carOwners;


    public Car(String model, String producer, Double engine, Double price, Integer yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.engine = engine;
        this.price = price;
        this.yearOfProduction = yearOfProduction;
    }

    public Double getPrice() {
        return price;
    }

    public Double getGarageValue(Car[] garage){
        int x = 0;
        double sum = 0.0;
        while (garage.length < x){
           sum =+ garage[x].price;
           x++;
        }
        return sum;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Car o = (Car) object;
        return (model.equals(o.model) &&
                producer.equals(o.producer) &&
                engine.equals(o.engine) &&
                price.equals(o.price));
    }

    @Override
    public void turnOn() {
        System.out.println("Wkładasz kluczyk i przekręcasz do połowy");
        System.out.println("Czekasz aż lampki zgasną");
        System.out.println("Przekręcasz do końca ");
        System.out.println("Silnik robi brrrrrrrrrr");

    }

    public void sellCar(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasACar(this)) {
            throw new Exception("Sprzedającu nie posiada samochodu");
        }
        if (price > buyer.getCash()) {
            throw new Exception("Braki mamony boli przez całe życie");
        }
        if (!buyer.hasFreeParkingLot()) {
            throw new Exception("Masz za dużo aut a za mały garaż...");
        }
        if(this.carOwners.get(this.carOwners.size()-1)!=seller.firstName){
            throw new Exception("Panie a gdzie dowód zakupy???");
        }
        buyer.addCar(this);
        seller.animal = null;
        seller.setCash(seller.getCash() + price);
        buyer.setCash(buyer.getCash() - price);
        System.out.println("Tranzakcja został sfinalizowana");
    }

    public String toString() {
        return model + " " + producer + " " + engine + " " + price;
    }

    public abstract void refuel();

    public Boolean checkWasOwner(Human human){
        for(int i=0; this.carOwners.size()-1 <= i; i++){
            if(this.carOwners.get(i)==human.firstName){
                return true;
            }
        }
        return false;
    }
    public Boolean checkTransactionOwner(Human seller, Human buyer){
        for(int i=0; this.carOwners.size()-1 <= i; i++) {
            if(this.carOwners.get(i)==seller.firstName){
                if(this.carOwners.get(i+1)==buyer.firstName){
                    return true;
                }
            }
        }
        return false;
    }
    public Integer allTransaction(){
        return this.carOwners.size()-1;
    }

}
