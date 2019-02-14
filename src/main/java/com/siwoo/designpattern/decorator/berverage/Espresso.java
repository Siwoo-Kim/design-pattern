package com.siwoo.designpattern.decorator.berverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    @Override
    public double cost() {
        return 1.99D;
    }
}
