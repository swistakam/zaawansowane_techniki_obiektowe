package com.company.creatures;

public abstract class Animal {
    private static final Double DEFAULT_DOG_WEIGHT = 3.0;
    private static final Double DEFAULT_CAT_WEIGHT = 1.0;
    private static final Double DEFAULT_ANIMAL_WEIGHT = 2.0;
    final String species;
    public String name;
    private Integer age;
    private Double weight;
    private Boolean alive;

    Animal(String species, String name){
        this.alive = true;
        this.species = species;
        this.name = name;

        if(species.equals("canis")){
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if(species.equals("felis")){
            this.weight = DEFAULT_CAT_WEIGHT;
        } else{
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    public Double getWeight(){
        return this.weight;
    }

    private Boolean isAlive(){
        if(this.alive && this.weight>0){
            return true;
        } else{
            this.alive = false;
            return false;
        }
    }

    public void  feed(){
        if(isAlive()){
            this.weight += 0.3;
            System.out.println("Mniam mniam");
        } else {
            System.out.println("Idź się lecz zły człowieku");
        }

    }
    public void takeForAWalk(){
        if(isAlive()){
            this.weight -=0.2;
            System.out.println(this.name+ " chodź na spacerek!");
        } else {
            System.out.println("Chcesz wyprowadzać nieżywe zwierzę ty chory ... człowieku");
        }

    }

    public void sall(Human seller, Human buyer, Double price){
        if(seller.animal == null){
            System.out.println("Sprzedającu nie posiada zwierzaka");
        }else if(price > buyer.getCash()){
            System.out.println("Braki mamony zawszę bolą");
        }else{
            buyer.animal = seller.animal;
            seller.animal = null;
            seller.setCash(seller.getCash()+price);
            buyer.setCash(buyer.getCash()-price);
            System.out.println("Tranzakcja został sfinalizowana");
        }
    }

    public String toString(){
        return species+" "+name+" "+age+" "+weight+" "+alive;
    }

    public abstract void beEaten();
}

