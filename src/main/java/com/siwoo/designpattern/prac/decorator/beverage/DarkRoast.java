package com.siwoo.designpattern.prac.decorator.beverage;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        super.setDescription("DarkRoast");
    }

    @Override
    public float cost() {
        return 2.5F;
    }

}
