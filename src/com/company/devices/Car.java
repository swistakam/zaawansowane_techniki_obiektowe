package com.company.devices;

public class Car {
    final String model;
    final String producer;
    private Double engine;
    private Double price;



    public Car(String model, String producer, Double engine, Double price) {
        this.model = model;
        this.producer = producer;
        this.engine = engine;
        this.price = price;
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

    public String toString(){
        return model+" "+producer+" "+engine+" "+price;
    }
}
