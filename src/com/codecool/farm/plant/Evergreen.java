package com.codecool.farm.plant;

public abstract class Evergreen extends Plant {

    public static final int INCREASE_BY_LEAF = 8;
    public static final int MAX_PRODUCTION = 70;

    public Evergreen(int monthlyProduction) {
        super(monthlyProduction);
    }

    @Override
    public void proceedMonth() {
        super.proceedMonth();
        if (age % 5 == 0) growLeaf();
        limitProduction();
    }

    private void growLeaf() {
        monthlyProduction += INCREASE_BY_LEAF;
    }

    private void limitProduction() {
        if (monthlyProduction > 70) System.out.println(this + " at full production!");
        monthlyProduction = Math.min(monthlyProduction, MAX_PRODUCTION);
    }

    @Override
    public String toString() {
        return "Evergreen{" +
                "monthlyProduction=" + monthlyProduction +
                ", age=" + age +
                '}';
    }

}
