package com.codecool.farm.plant;

public abstract class Plant {

    private static final int MONTHLY_INCREASE = 4;
    protected int monthlyProduction;
    protected int age;

    public Plant(int monthlyProduction) {
        this.monthlyProduction = monthlyProduction;
        this.age = 0;
    }

    public int getMonthlyProduction() {
        return monthlyProduction;
    }

    public void proceedMonth() {
        monthlyProduction += MONTHLY_INCREASE;
        age++;
    };

}
