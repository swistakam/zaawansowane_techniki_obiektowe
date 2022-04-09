package com.company.devices;

public abstract class Device {
    Integer yearOfProduction;
    String producer;
    String model;
    Double price;


    abstract public void turnOn();

    abstract public String toString();


}
