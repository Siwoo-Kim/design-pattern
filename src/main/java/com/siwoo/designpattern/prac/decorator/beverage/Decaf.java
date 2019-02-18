package com.siwoo.designpattern.prac.decorator.beverage;

public class Decaf extends Beverage {

    public Decaf() {
        super.setDescription("Decaf");
    }

    @Override
    public float cost() {
        return 1.5F;
    }
}
