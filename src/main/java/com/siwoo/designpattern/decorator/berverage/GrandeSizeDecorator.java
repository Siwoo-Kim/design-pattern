package com.siwoo.designpattern.decorator.berverage;


public class GrandeSizeDecorator extends SizeDecorator {
    private Beverage target;

    public GrandeSizeDecorator(Beverage target) {
        this.target = target;
    }

    @Override
    public String getDescription() {
        return target.getDescription() + ", Grande Size";
    }

    @Override
    public double cost() {
        return target.cost();
    }
}
