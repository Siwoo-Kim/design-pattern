package com.siwoo.designpattern.prac.strategy.duck.strategy;


public class Quack implements QuackStrategy {
    @Override
    public void perform() {
        System.out.println("quack");
    }
}
