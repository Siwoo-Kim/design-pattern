package com.siwoo.designpattern.prac.decorator.beverage;

public abstract class Beverage {
    private String description = "null";
    private boolean milk;
    private boolean mocha;
    private SIZE size = SIZE.GRANDE;

    public enum SIZE {
        TALL, GRANDE, VENTI
    }

    public void setSize(SIZE size) {
        this.size = size;
    }

    public SIZE getSize() {
        return size;
    }

    protected void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract float cost();

//    public float cost() {
//        float cost = 0.0f;
//        if (hasMilk()) {
//            cost += 0.5F;
//        }
//        if (hasMocha()) {
//            cost += 0.5F;
//        }
//        return cost;
//    };


    public boolean hasMilk() {
        return milk;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public boolean hasMocha() {
        return mocha;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

}
