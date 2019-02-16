package com.siwoo.designpattern.prac.strategy.duck.strategy;

public class FlyNoWay implements FlyStrategy {
    @Override
    public void perform() {
        System.out.println("Fly no way.");
    }
}
