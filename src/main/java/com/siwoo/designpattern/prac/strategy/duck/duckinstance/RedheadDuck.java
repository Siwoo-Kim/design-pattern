package com.siwoo.designpattern.prac.strategy.duck.duckinstance;

import com.siwoo.designpattern.prac.strategy.duck.strategy.FlyWithWings;
import com.siwoo.designpattern.prac.strategy.duck.strategy.Quack;

public class RedheadDuck extends DuckContext {

    public RedheadDuck() {
        setFlyStrategy(new FlyWithWings());
        setQuackStrategy(new Quack());
    }

    @Override
    void display() {
        System.out.println("RedheadDuck");
    }
}
