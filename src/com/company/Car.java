package com.company;

public class Car {
    final String model;
    final String producer;
    private Double engine;
    private Integer numberOfDoors;
    private Double price;
    private String equipment;


    Car(String model, String producer, Double engine){
        this.model = model;
        this.producer = producer;
        this.engine = engine;
        this.numberOfDoors = 5;
    }

    public Double getPrice() {
        return price;
    }
}
