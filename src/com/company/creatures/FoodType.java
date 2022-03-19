package com.company.creatures;

public enum FoodType {
        MEET(0.7),
        CROPS(0.3),
        ALL(0.5);

        final Double foodBodyRation;

        FoodType(double foodBodyRationv) {
            this.foodBodyRation = foodBodyRationv;
        }
}
