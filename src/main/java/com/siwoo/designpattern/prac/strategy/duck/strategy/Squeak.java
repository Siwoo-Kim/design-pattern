package com.siwoo.designpattern.prac.strategy.duck.strategy;

public class Squeak implements QuackStrategy {
    @Override
    public void perform() {
        System.out.println("squeak");
    }
}
