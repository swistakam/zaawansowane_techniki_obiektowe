package com.company.devices;

public class Car extends Device {
    private Double engine;
    private Double price;



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

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }if (object == null || getClass() != object.getClass()) {
            return false;
        }
        Car o = (Car) object;
        return  (model.equals(o.model) &&
                producer.equals(o.producer) &&
                engine.equals(o.engine)&&
                price.equals(o.price));
    }

    @Override
    public void turnOn() {
        System.out.println("Wkładasz kluczyk i przekręcasz do połowy");
        System.out.println("Czekasz aż lampki zgasną");
        System.out.println("Przekręcasz do końca ");
        System.out.println("Silnik robi brrrrrrrrrr");

    }

    public String toString(){
        return model+" "+producer+" "+engine+" "+price;
    }
}
