package com.siwoo.designpattern.prac.strategy.duck.strategy;

public class Mute implements QuackStrategy {
    @Override
    public void perform() {
        System.out.println("...");
    }
}
