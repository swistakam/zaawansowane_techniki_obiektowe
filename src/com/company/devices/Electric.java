package com.company.devices;

public class Electric extends Car{
    public Electric(String model, String producer, Double engine, Double price, Integer yearOfProduction) {
        super(model, producer, engine, price, yearOfProduction);
    }

    @Override
    public void refuel() {

    }
}
