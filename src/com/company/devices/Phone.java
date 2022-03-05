package com.company.devices;

import com.company.devices.Device;

import java.util.List;

public class Phone extends Device {
    Double screenSize;
    final static Double appVersion = 2.0;
    final static String serverIP = "94.23.90.4";



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
    public void installAnnApp(String appName){

    }
    public void installAnnApp(String appName, Double appVersion){

    }
    public void installAnnApp(String appName, Double appVersion, String serverIP){

    }
    public void installAnnApp(List<String> appsNames){

    }
    public void installAnnApp(Object url,String appName, Double appVersion, String serverIP){

    }


}
