package com.siwoo.designpattern.decorator.berverage;

public class SmallSizeDecorator extends SizeDecorator {
    private Beverage target;

    public SmallSizeDecorator(Beverage target) {
        this.target = target;
    }

    @Override
    public String getDescription() {
        return target.getDescription() + ", Small Size";
    }

    @Override
    public double cost() {
        return  target.cost() - (target.cost() * 0.2D);
    }
}
