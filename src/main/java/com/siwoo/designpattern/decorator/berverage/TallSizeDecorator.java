package com.siwoo.designpattern.decorator.berverage;

public class TallSizeDecorator extends SizeDecorator {
    private Beverage target;

    public TallSizeDecorator(Beverage target) {
        this.target = target;
    }

    @Override
    public String getDescription() {
        return target.getDescription() + ", Tall Size";
    }

    @Override
    public double cost() {
        return  target.cost() + (target.cost() * 0.2D);
    }
}
