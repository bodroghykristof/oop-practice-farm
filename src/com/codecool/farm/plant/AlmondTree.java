package com.codecool.farm.plant;

import java.util.Random;

public class AlmondTree extends Plant implements Rottable {

    private static final int INITIAL_PRODUCTION = 50;
    private static final int BOOST_OF_SHROOM = 10;
    private static final double CHANCE_OF_SHROOM_GROW = 0.08;
    private static final double CHANCE_OF_ROT = 0.13;
    private static final double DROP_BY_ROT = 18;

    public AlmondTree() {
        super(INITIAL_PRODUCTION);
    }

    @Override
    public void growShroom() {
        if (Math.random() < CHANCE_OF_SHROOM_GROW) monthlyProduction += BOOST_OF_SHROOM;
    }

    @Override
    public boolean rot() {
        if (Math.random() < CHANCE_OF_ROT) {
            monthlyProduction -= DROP_BY_ROT;
            return true;
        }
        return false;
    }

}
