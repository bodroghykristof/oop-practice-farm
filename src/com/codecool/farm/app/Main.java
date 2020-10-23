package com.codecool.farm.app;

import com.codecool.farm.Farm;
import com.codecool.farm.plant.AlmondTree;
import com.codecool.farm.plant.Juniper;
import com.codecool.farm.plant.Spruce;

public class Main {

    public static void main(String[] args) {

        Farm farm = new Farm();
        createPlants(farm);
        for (int i = 0; i < 80; i++) farm.proceedMonth();
        System.out.println(farm.getFoodAmount());

    }

    private static void createPlants(Farm farm) {
        farm.addPlant(new AlmondTree());
        farm.addPlant(new Spruce());
        farm.addPlant(new Juniper());
        farm.addPlant(new Juniper());
    }

}
