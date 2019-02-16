package com.siwoo.designpattern.prac.strategy.duck.duckinstance;

import com.siwoo.designpattern.prac.strategy.duck.strategy.FlyWithWings;
import com.siwoo.designpattern.prac.strategy.duck.strategy.Squeak;

public class MallardDuck extends DuckContext {

    public MallardDuck() {
        setFlyStrategy(new FlyWithWings());
        setQuackStrategy(new Squeak());
    }

    @Override
    void display() {
        System.out.println("MallardDuck");
    }
}
