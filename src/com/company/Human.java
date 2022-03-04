package com.company;

public class Human extends Animal{

    public String firstName;
    public String lastName;
    private Double salary;
    public Car car;

    Human(String firstName, String lastName){
        super("Homo sapiens ", firstName + " " + lastName);
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void getSalary(){
        System.out.println("Ostatni data pobranie wartości");
        
    }

    public void setSalary(Double salary){
        if(salary>0){
            System.out.println("Została dodana nowa wpłata do systemu");
            System.out.println("Aneks do umowy bardzo proszę odebrać od Pani Hanny Kowalskiej z działu kadr");
            System.out.println("ZUS i US już i tak o tym wiedzą, daj sobie lepiej spokój. Na co ci to?");
            this.salary = salary;
        }else{
            System.out.println("Co to za minusowe wartości? Co to ma być!?");
        }
    }

}
