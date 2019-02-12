package com.siwoo.designpattern.strategy.duck;

import com.siwoo.designpattern.strategy.behavior.FlyWithWings;
import com.siwoo.designpattern.strategy.behavior.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        setQuackBehavior(new Quack());
        setFlyBehavior(new FlyWithWings());
    }

    @Override
    public void display() {
        System.out.println("MallardDuck");
    }
}
