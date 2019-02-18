package com.siwoo.designpattern.prac.decorator.beverage;

public class HouseBlend extends Beverage {

    public HouseBlend() {
        super.setDescription("HouseBlend");
    }

    @Override
    public float cost() {
        return 1.5F;
    }

}
