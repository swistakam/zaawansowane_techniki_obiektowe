package com.company.devices;

public class LPG extends Car{

    public LPG(String model, String producer, Double engine, Double price, Integer yearOfProduction) {
        super(model, producer, engine, price, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
