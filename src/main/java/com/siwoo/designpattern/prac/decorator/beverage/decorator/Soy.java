package com.siwoo.designpattern.prac.decorator.beverage.decorator;

import com.siwoo.designpattern.prac.decorator.beverage.Beverage;

public class Soy extends Condiment {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        setBeverage(beverage);
    }

    @Override
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public float cost() {
        return beverage.cost() + 0.15F;
    }
}
