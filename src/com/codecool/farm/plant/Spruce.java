package com.codecool.farm.plant;

public class Spruce extends Evergreen implements Rottable {

    private static final int INITIAL_PRODUCTION = 26;
    private static final int BOOST_OF_SHROOM = 15;
    private static final double CHANCE_OF_SHROOM_GROW = 0.05;
    private static final double CHANCE_OF_ROT = 0.04;
    private static final double DROP_BY_ROT = 20;

    public Spruce() {
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
