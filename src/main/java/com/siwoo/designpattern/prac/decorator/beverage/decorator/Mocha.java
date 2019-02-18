package com.siwoo.designpattern.prac.decorator.beverage.decorator;

import com.siwoo.designpattern.prac.decorator.beverage.Beverage;

public class Mocha extends Condiment {
    private Beverage beverage;

    public Mocha(Beverage beverage) {
        setBeverage(beverage);
    }

    @Override
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.2F;
    }
}
