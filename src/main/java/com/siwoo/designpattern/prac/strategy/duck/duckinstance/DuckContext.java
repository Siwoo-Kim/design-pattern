package com.siwoo.designpattern.prac.strategy.duck.duckinstance;

import com.siwoo.designpattern.prac.strategy.duck.strategy.FlyStrategy;
import com.siwoo.designpattern.prac.strategy.duck.strategy.QuackStrategy;

public abstract class DuckContext {
    private FlyStrategy flyStrategy;
    private QuackStrategy quackStrategy;


    public void swim() {
        System.out.println("swim");
    };

    abstract void display();

    public void fly() {
        flyStrategy.perform();
    }

    public void quack() {
        quackStrategy.perform();
    }

    public void setFlyStrategy(FlyStrategy flyStrategy) {
        this.flyStrategy = flyStrategy;
    }

    public void setQuackStrategy(QuackStrategy quackStrategy) {
        this.quackStrategy = quackStrategy;
    }

}
