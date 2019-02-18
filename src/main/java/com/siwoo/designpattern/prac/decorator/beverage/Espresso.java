package com.siwoo.designpattern.prac.decorator.beverage;

public class Espresso extends Beverage {

    public Espresso() {
        setDescription("Espresso");
    }

    @Override
    public float cost() {
        return 1.99F;
    }
}
