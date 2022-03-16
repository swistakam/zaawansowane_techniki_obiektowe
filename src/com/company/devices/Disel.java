package com.company.devices;

public class Disel extends Car{

    public Disel(String model, String producer, Double engine, Double price, Integer yearOfProduction) {
        super(model, producer, engine, price, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
