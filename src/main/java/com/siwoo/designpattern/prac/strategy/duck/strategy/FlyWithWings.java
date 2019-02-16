package com.siwoo.designpattern.prac.strategy.duck.strategy;

public class FlyWithWings implements FlyStrategy {
    @Override
    public void perform() {
        System.out.println("Fly with wings.");
    }
}
