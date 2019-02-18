package com.siwoo.designpattern.prac.decorator.beverage.decorator;

import com.siwoo.designpattern.prac.decorator.beverage.Beverage;

public class Whip extends Condiment {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public void setSize(SIZE size) {
        beverage.setSize(size);
    }

    @Override
    public SIZE getSize() {
        return beverage.getSize();
    }

    @Override
    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", whip";
    }

    @Override
    public float cost() {
        switch (beverage.getSize()) {
            case TALL: return beverage.cost() + (0.1F * beverage.cost());
            case GRANDE: return beverage.cost() + (0.2F * beverage.cost());
            case VENTI: return beverage.cost() + (0.3F * beverage.cost());
            default: throw new IllegalArgumentException();
        }
    }
}
