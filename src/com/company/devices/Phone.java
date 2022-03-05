package com.company.devices;

import com.company.devices.Device;

public class Phone extends Device {
    Double screenSize;

    @Override
    public void turnOn(){
        System.out.println("Wciskam przycisk");
        System.out.println("ooooooo");
        System.out.println("ooooooo");
        System.out.println("ooooooo");
        System.out.println("Dzień dobry!");
    }
    public String toString(){
        return model+" "+yearOfProduction+" "+producer;
    }
}
