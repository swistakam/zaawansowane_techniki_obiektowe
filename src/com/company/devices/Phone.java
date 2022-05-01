package com.company.devices;

import com.company.creatures.Human;
import com.company.devices.Device;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Phone extends Device {

    public enum OperationSystem{
        ANDROID,WINDOWS_MOBILE,iOS;
    }


    Double screenSize;
    final static Double appVersion = 2.0;
    final static String serverIP = "94.23.90.4";
    final static Integer protocol = 21;
    public OperationSystem operationSystem;
    public List<Application> applications;



    public void installApp(Human buyer , Application application) throws Exception {
        if (application.getPrice() > buyer.getCash()){
          throw new Exception("Braki mamony boli przez całe życie");
        }
        this.applications.add(application);
        buyer.setCash(buyer.getCash() - application.getPrice());
    }

    public Boolean isInstalled(Application application){
        for(int i=0; this.applications.size()-1 <= i; i++){
            if(this.applications.get(i)==application){
                return true;
            }
        }
        return false;
    }

    public Boolean isInstalled(String appName){
        for(int i=0; this.applications.size()-1 <= i; i++){
            if(this.applications.get(i).getName() == appName){
                return true;
            }
        }
        return false;
    }

    public void freeApps(){
        for(int i=0; this.applications.size()-1 <= i; i++){
            if(this.applications.get(i).getPrice() == 0){
                System.out.println(this.applications.get(i).getName());
            }
        }
    }

    public Integer totalAppsPrice(){
        double sum=0;
        for(int i=0; this.applications.size()-1 <= i; i++){
            sum =+ this.applications.get(i).getPrice();
        }
        return 0;
    }

    public void allAppsNameSorted() {
    }
    public void allAppsCostSorted(){
    }


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
