package com.codecool.farm;

import com.codecool.farm.plant.Plant;
import com.codecool.farm.plant.Rottable;

import java.util.ArrayList;
import java.util.List;

public class Farm {

    private final List<Plant> plants = new ArrayList<>();
    private final List<Rottable> rottables = new ArrayList<>();
    private int foodAmount = 0;
    private boolean canHarvest = true;

    public void addPlant(Plant plant) {
        plants.add(plant);
        if (plant instanceof Rottable) rottables.add((Rottable) plant);
    }

    public int getFoodAmount() {
        return foodAmount;
    }

    public void proceedMonth() {
        plants.forEach(Plant::proceedMonth);
        rottables.forEach(Rottable::growShroom);
        if (rottables.stream().anyMatch(Rottable::rot)) canHarvest = false;
        if (canHarvest) harvest();
        canHarvest  = true;
    }

    private void harvest() {
        plants.forEach(plant -> foodAmount += plant.getMonthlyProduction());
    }

}
